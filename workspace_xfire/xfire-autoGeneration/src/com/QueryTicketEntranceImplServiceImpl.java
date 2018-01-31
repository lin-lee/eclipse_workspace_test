
package com;

import javax.jws.WebService;
import com.ticket.webservice.ResultQueryTicketType;

@WebService(serviceName = "QueryTicketEntranceImplService", targetNamespace = "http://webservice.ticket.com/", endpointInterface = "com.QueryTicketEntrance")
public class QueryTicketEntranceImplServiceImpl
    implements QueryTicketEntrance
{


    public ResultQueryTicketType queryTicketEntrance(String AgentID, String AgentPassword, String CompanyID, String OrderId, String EntranceTimeStart, String EntranceTimeEnd) {
        throw new UnsupportedOperationException();
    }

}
