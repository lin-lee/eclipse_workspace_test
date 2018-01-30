package lin.model_one;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;

public class te {
	public static void main(String [] args){
		final ThreadInfo[] threadInfos = ManagementFactory.getThreadMXBean().dumpAllThreads(true, true);  
		for (ThreadInfo threadInfo : threadInfos) {  
		    System.out.println(threadInfo.toString());  
		}  
	}
}
