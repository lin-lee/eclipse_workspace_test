

import java.util.HashMap;
import java.util.Map;

public class FinalTest {
	
	private Map<Long, Long> providerApplyFailMap = new HashMap<Long, Long>();
	
	
	public Map<Long, Long> getProviderApplyFailMap() {
		return providerApplyFailMap;
	}

	public static void main(String [] args){
		FinalTest f = new FinalTest();
		if(f.getProviderApplyFailMap().get(1L) == null)
			f.providerApplyFailMap.put(1L, 0L);
		f.testProviderApplyFailCounts();
	}
	
	public void testProviderApplyFailCounts(){
		String content = "";
		String originalContent = "";
		for (Map.Entry<Long, Long> entry : this.getProviderApplyFailMap().entrySet()) {
            Long providerId = entry.getKey();
        
            Long num = entry.getValue();
		}
	}

}
