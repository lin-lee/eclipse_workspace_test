
package out;

import javax.xml.namespace.QName;
import org.codehaus.xfire.fault.FaultInfoException;

public class IllegalBlockSizeException
    extends FaultInfoException
{

    private com.xiexie.ticket.webservice.IllegalBlockSizeException faultInfo;

    public IllegalBlockSizeException(String message, com.xiexie.ticket.webservice.IllegalBlockSizeException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public IllegalBlockSizeException(String message, Throwable t, com.xiexie.ticket.webservice.IllegalBlockSizeException faultInfo) {
        super(message, t);
        this.faultInfo = faultInfo;
    }

    public com.xiexie.ticket.webservice.IllegalBlockSizeException getFaultInfo() {
        return faultInfo;
    }

    public static QName getFaultName() {
        return new QName("http://webservice.ticket.xiexie.com/", "IllegalBlockSizeException");
    }

}
