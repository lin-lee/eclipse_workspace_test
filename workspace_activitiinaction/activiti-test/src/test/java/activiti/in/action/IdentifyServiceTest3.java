package activiti.in.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.activiti.engine.test.ActivitiRule;
import org.junit.Rule;
import org.junit.Test;


public class IdentifyServiceTest3 {
	@Rule
	public ActivitiRule activitiRule = new ActivitiRule("activiti.cfg.xml");
	
	@Test
	public void testUserAndGroupMemership(){
		IdentityService identityService = activitiRule.getIdentityService();
		
		Group group = identityService.newGroup("deptLeader");
		group.setName("部门领导");
		group.setType("assignment");
		identityService.saveGroup(group);
		
		User user = identityService.newUser("henryyan");
		user.setFirstName("Henry");
		user.setLastName("Yan");
		user.setEmail("yanhonglei@gmail.com");
		identityService.saveUser(user);
		
		identityService.createMembership("henryyan", "deptLeader");
		
		User userInGroup = identityService.createUserQuery().memberOfGroup("deptLeader")
						.singleResult();
		assertNotNull(userInGroup);
		assertEquals("henryyan", userInGroup.getId());
		
		Group groupContainsHenryyan = 
				identityService.createGroupQuery().groupMember("henryyan").singleResult();
		
		assertNotNull(groupContainsHenryyan);
		assertEquals("deptLeader", groupContainsHenryyan.getId());
	}

}
