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


#include "ow_commands_v2.h"

#define SUCCESS_CHECK( f ) { apr_status_t rc=f; if(rc!=APR_SUCCESS) return rc; }


ow_DataStructure *ow_create_object(ow_byte type, apr_pool_t *pool)
{
   switch( type ) {

   }
   return 0;
}

apr_status_t ow_marshal1_object(ow_bit_buffer *buffer, ow_DataStructure *object)
{
   switch( object->structType ) {

   }
   return APR_EGENERAL;
}

apr_status_t ow_marshal2_object(ow_byte_buffer *buffer, ow_bit_buffer *bitbuffer, ow_DataStructure *object)
{
   switch( object->structType ) {

   }
   return APR_EGENERAL;
}

apr_status_t ow_unmarshal_object(ow_byte_array *buffer, ow_bit_buffer *bitbuffer, ow_DataStructure *object, apr_pool_t *pool)
{
   switch( object->structType ) {

   }
   return APR_EGENERAL;
}
