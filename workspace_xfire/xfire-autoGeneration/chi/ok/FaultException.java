
package ok;

import javax.xml.namespace.QName;
import org.codehaus.xfire.fault.FaultInfoException;

public class FaultException
    extends FaultInfoException
{

    private cn.chimelong.agent.ws.FaultException faultInfo;

    public FaultException(String message, cn.chimelong.agent.ws.FaultException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public FaultException(String message, Throwable t, cn.chimelong.agent.ws.FaultException faultInfo) {
        super(message, t);
        this.faultInfo = faultInfo;
    }

    public cn.chimelong.agent.ws.FaultException getFaultInfo() {
        return faultInfo;
    }

    public static QName getFaultName() {
        return new QName("http://ws.agent.chimelong.cn", "FaultException");
    }

}
