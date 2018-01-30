package activiti.in.action;

import static org.junit.Assert.*;

import java.util.List;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.test.ActivitiRule;
import org.junit.Rule;
import org.junit.Test;

public class IdentityServiceTest2 {
	@Rule
	public ActivitiRule activitiRule = new ActivitiRule("activiti.cfg.xml");
	
	@Test
	public void testGroup(){
		IdentityService identityService = activitiRule.getIdentityService();
		
		Group group = identityService.newGroup("deptLeader");
		group.setName("部门领导");
		group.setType("assignment");
		
		identityService.saveGroup(group);
		
		List<Group> groupList = identityService.createGroupQuery().groupId("deptLeader")
				.list();
		assertEquals(1, groupList.size());
		
		identityService.deleteGroup("deptLeader");
		
		groupList = identityService.createGroupQuery().groupId("deptLeader").list();
		assertEquals(0, groupList.size());
	}

}
