
package out;

import javax.jws.WebService;

@WebService(serviceName = "GoodsOperationService", targetNamespace = "http://imp.webservice.ticket.xiexie.com/", endpointInterface = "out.GoodsOperationInterFace")
public class GoodsOperationServiceImpl
    implements GoodsOperationInterFace
{


    public String getElementRequest(String parm)
        throws IllegalBlockSizeException
    {
        throw new UnsupportedOperationException();
    }

}
