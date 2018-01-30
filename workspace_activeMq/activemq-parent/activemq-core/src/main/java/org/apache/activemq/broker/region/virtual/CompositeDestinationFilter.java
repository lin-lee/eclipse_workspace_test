/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.broker.region.virtual;

import java.util.Collection;
import java.util.Iterator;

import org.apache.activemq.broker.ProducerBrokerExchange;
import org.apache.activemq.broker.region.Destination;
import org.apache.activemq.broker.region.DestinationFilter;
import org.apache.activemq.command.ActiveMQDestination;
import org.apache.activemq.command.Message;
import org.apache.activemq.filter.MessageEvaluationContext;
import org.apache.activemq.filter.NonCachedMessageEvaluationContext;

/**
 * Represents a composite {@link Destination} where send()s are replicated to
 * each Destination instance.
 * 
 * 
 */
public class CompositeDestinationFilter extends DestinationFilter {

    private Collection forwardDestinations;
    private boolean forwardOnly;
    private boolean copyMessage;

    public CompositeDestinationFilter(Destination next, Collection forwardDestinations, boolean forwardOnly, boolean copyMessage) {
        super(next);
        this.forwardDestinations = forwardDestinations;
        this.forwardOnly = forwardOnly;
        this.copyMessage = copyMessage;
    }

    public void send(ProducerBrokerExchange context, Message message) throws Exception {
        MessageEvaluationContext messageContext = null;

        for (Iterator iter = forwardDestinations.iterator(); iter.hasNext();) {
            ActiveMQDestination destination = null;
            Object value = iter.next();

            if (value instanceof FilteredDestination) {
                FilteredDestination filteredDestination = (FilteredDestination)value;
                if (messageContext == null) {
                    messageContext = new NonCachedMessageEvaluationContext();
                    messageContext.setMessageReference(message);
                }
                messageContext.setDestination(filteredDestination.getDestination());
                if (filteredDestination.matches(messageContext)) {
                    destination = filteredDestination.getDestination();
                }
            } else if (value instanceof ActiveMQDestination) {
                destination = (ActiveMQDestination)value;
            }
            if (destination == null) {
                continue;
            }

            Message forwarded_message;
            if (copyMessage) {
                forwarded_message = message.copy();
                forwarded_message.setDestination(destination);
            }
            else {
                forwarded_message = message;
            }

            send(context, forwarded_message, destination);
        }
        if (!forwardOnly) {
            super.send(context, message);
        }
    }
}
