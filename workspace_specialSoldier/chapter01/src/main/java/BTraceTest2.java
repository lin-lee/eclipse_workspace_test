
import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

import java.lang.reflect.Field;
import java.util.Map;

@BTrace
public class BTraceTest2 {

	@TLS
    static long startTime;

    @OnMethod(
            clazz="com.lvmama.vst.passport.service.impl.SupplierOrderOtherServiceImpl",
            method="getCodeImage"
    )
    public static void traceExecute() {
            startTime = timeMillis();
    }

    @OnMethod(
            clazz="com.lvmama.vst.passport.service.impl.SupplierOrderOtherServiceImpl",
            method="getCodeImage",
            location=@Location(Kind.RETURN)
    )
    public static void traceExecute(@Return byte[] result ,
                                    @Self com.lvmama.vst.passport.service.impl.SupplierOrderOtherServiceImpl supplierOrderOtherService,
                                    @ProbeClassName String className,
                                    @ProbeMethodName String methodName,
                                  
                                    String passSerialNo) {
         println("====================================>");
         println(strcat("call class = " , className));
         println(strcat("call method = " , methodName));

         Field passCodeService = field(className , "passCodeService");
       
         println(strcat("property name = " , str(get(passCodeService , supplierOrderOtherService))));



         jstack();
         println(strcat("delay:" , str(timeMillis() - startTime)));
         println(strcat("return value is:",str(result)));
         
    }
}
