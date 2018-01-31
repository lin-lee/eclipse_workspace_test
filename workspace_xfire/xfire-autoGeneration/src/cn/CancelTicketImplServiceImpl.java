
package cn;

import javax.jws.WebService;
import com.ticket.webservice.ResultCancelTicket;

@WebService(serviceName = "CancelTicketImplService", targetNamespace = "http://webservice.ticket.com/", endpointInterface = "cn.CancelTicket")
public class CancelTicketImplServiceImpl
    implements CancelTicket
{


    public ResultCancelTicket cancelTicket(String AgentOrderID, String AgentID, String AgentPassword, String CompanyID, String OrderName, String OrderPhoneNumber, String PayFlag) {
        throw new UnsupportedOperationException();
    }

}
