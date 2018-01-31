
package ok;

import java.math.BigDecimal;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import cn.chimelong.agent.ws.model.ArrayOfBaseCategory;
import cn.chimelong.agent.ws.model.ArrayOfBaseTicket;
import cn.chimelong.agent.ws.model.ArrayOfMaXiActTime;
import cn.chimelong.agent.ws.model.ArrayOfPark;
import cn.chimelong.agent.ws.model.ArrayOfParkBaseTicket;
import cn.chimelong.agent.ws.model.ArrayOfParkQuantity;
import cn.chimelong.agent.ws.model.ArrayOfQueryTicket;
import cn.chimelong.agent.ws.model.ArrayOfTicket;
import cn.chimelong.agent.ws.model.CancelResult;
import cn.chimelong.agent.ws.model.OrderInfo;
import cn.chimelong.agent.ws.model.OrderResult;
import cn.chimelong.agent.ws.model.QueryResult;
import cn.grgbanking.apt.pojos.ticket.ArrayOfEspecialTicket;

@WebService(serviceName = "TicketService", targetNamespace = "http://ws.agent.chimelong.cn", endpointInterface = "ok.TicketServicePortType")
public class TicketServiceImpl
    implements TicketServicePortType
{


    public String regionTicketSale(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public String checkHasAERA(String in0)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public QueryResult queryOrder(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public void detainOrder(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public String getEsAeraCount(String in0, String in1, String in2)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfParkBaseTicket queryParkBaseTicket()
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfEspecialTicket queryAllEspecialTicket()
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfQueryTicket queryTicketQuantity(ArrayOfQueryTicket in0, XMLGregorianCalendar in1)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public OrderResult queryOrderByMerOid(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public void detainAreaTicketOrder(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public String checkAeraStatus()
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public OrderResult fetchTicket(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public String onlineActiveMaxi(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfTicket queryTickets(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public OrderInfo queryOrderBySSN(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public String getMaxiCount(String in0, String in1)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfPark queryParks()
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public OrderResult buyTicket(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public CancelResult cancelOrder(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public String cancalActiveMaxi(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfTicket queryAllTickets(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfMaXiActTime findMaXiActTime(String in0)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfTicket queryFixedDateTickets(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public String queryAgentInfo(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfParkQuantity queryParkTicketAvaiableQuantity(XMLGregorianCalendar in0)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public String checkMaxiCount(String in0, String in1, String in2)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public OrderResult findMaxiActive(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfBaseTicket queryBaseTickets()
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public OrderResult buyETicket(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public BigDecimal queryMoney(String in0, String in1, String in2, String in3)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public String checkHasMaXi(String in0)
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

    public ArrayOfBaseCategory queryBaseCategory()
        throws FaultException
    {
        throw new UnsupportedOperationException();
    }

}
