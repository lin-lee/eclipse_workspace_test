package activiti.in.action;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.User;
import org.activiti.engine.test.ActivitiRule;
import org.junit.Rule;
import org.junit.Test;


public class IdentifyServiceTest {
	@Rule
	public ActivitiRule activitiRule = new ActivitiRule();
	
	@Test
	public void testUser(){
		IdentityService identityService = activitiRule.getIdentityService();
		
		User user = identityService.newUser("henryyan");
		user.setFirstName("Henry");
		user.setLastName("Yan");
		user.setEmail("yanhonglei@gmail.com");
		
		identityService.saveUser(user);
		
		User userInDb = identityService.createUserQuery()
						.userId("henryyan").singleResult();
		assertNotNull(userInDb);
		
		identityService.deleteUser("henryyan");
		
		userInDb = identityService.createUserQuery().userId("henryyan").singleResult();
		assertNull(userInDb);
	}

}
