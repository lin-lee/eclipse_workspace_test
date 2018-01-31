
import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

import java.lang.reflect.Field;
import java.util.Map;

@BTrace
public class BTraceTest4 {

	@TLS
    static long startTime;

    @OnMethod(
            clazz="com.lvmama.vst.passport.job.PassportProcessTimeoutDetectionJob",
            method="run"
    )
    public static void traceExecute() {
            startTime = timeMillis();
    }

    @OnMethod(
    		 clazz="com.lvmama.vst.passport.job.PassportProcessTimeoutDetectionJob",
             method="run",
            location=@Location(Kind.RETURN)
    )
    public static void traceExecute(
                                    @Self com.lvmama.vst.passport.job.PassportProcessTimeoutDetectionJob passportProcessTimeoutDetectionJob,
                                    @ProbeClassName String className,
                                    @ProbeMethodName String methodName
                                   ) {
         println("====================================>");
         println(strcat("call class = " , className));
         println(strcat("call method = " , methodName));





         jstack();
         println(strcat("delay:" , str(timeMillis() - startTime)));
      
         
    }
}
