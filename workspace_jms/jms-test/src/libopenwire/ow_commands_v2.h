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

/*****************************************************************************************
 *  
 * NOTE!: This file is auto generated - do not modify!
 *        if you need to make a change, please see the modify the groovy scripts in the
 *        under src/gram/script and then use maven openwire:generate to regenerate 
 *        this file.
 *  
 *****************************************************************************************/
 
#ifndef OW_COMMANDS_V2_H
#define OW_COMMANDS_V2_H

#include "ow.h"

#ifdef __cplusplus
extern "C" {
#endif /* __cplusplus */
      
#define OW_WIREFORMAT_VERSION 2
#define OW_WIREFORMAT_STACK_TRACE_MASK     0x00000001;
#define OW_WIREFORMAT_TCP_NO_DELAY_MASK    0x00000002;
#define OW_WIREFORMAT_CACHE_MASK           0x00000004;
#define OW_WIREFORMAT_COMPRESSION_MASK     0x00000008;
      
apr_status_t ow_bitmarshall(ow_bit_buffer *buffer, ow_DataStructure *object);
apr_status_t ow_marshall(ow_byte_buffer *buffer, ow_DataStructure *object);

#ifdef __cplusplus
}
#endif

#endif  /* ! OW_COMMANDS_V2_H */
