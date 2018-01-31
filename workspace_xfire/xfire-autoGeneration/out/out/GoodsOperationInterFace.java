
package out;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "GoodsOperationInterFace", targetNamespace = "http://webservice.ticket.xiexie.com/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface GoodsOperationInterFace {


    @WebMethod(operationName = "getElementRequest", action = "")
    @WebResult(name = "return", targetNamespace = "")
    public String getElementRequest(
        @WebParam(name = "parm", targetNamespace = "")
        String parm)
        throws IllegalBlockSizeException
    ;

}
