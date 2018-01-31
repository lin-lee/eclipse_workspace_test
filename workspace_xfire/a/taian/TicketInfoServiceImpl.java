
package taian;

import javax.jws.WebService;

@WebService(serviceName = "TicketInfoService", targetNamespace = "http://localhost", endpointInterface = "taian.TicketInfoServiceSoap")
public class TicketInfoServiceImpl
    implements TicketInfoServiceSoap
{


    public String getTicketPriceList(String sInputInfo) {
        throw new UnsupportedOperationException();
    }

    public String partialOrderCancel(String sInputInfo) {
        throw new UnsupportedOperationException();
    }

    public String getCheckList(String sInputInfo) {
        throw new UnsupportedOperationException();
    }

    public String getPromotionPriceList(String sInputInfo) {
        throw new UnsupportedOperationException();
    }

    public String cancelOrder(String sInputInfo) {
        throw new UnsupportedOperationException();
    }

    public String saveOrder(String sInputInfo) {
        throw new UnsupportedOperationException();
    }

    public String getBookList(String sInputInfo) {
        throw new UnsupportedOperationException();
    }

    public String getSaleList(String sInputInfo) {
        throw new UnsupportedOperationException();
    }

}
