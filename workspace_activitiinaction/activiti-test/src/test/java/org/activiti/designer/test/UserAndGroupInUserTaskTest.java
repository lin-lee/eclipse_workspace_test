package org.activiti.designer.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.annotation.Resource;

import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.test.ActivitiRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class UserAndGroupInUserTaskTest {

	private String filename = "E:\\eclipse32_enjoy_4.4.1\\workspace_activitiinaction\\activiti-test\\src\\main\\resources\\diagrams\\UserAndGroup.bpmn";

	@Rule
	public ActivitiRule activitiRule = new ActivitiRule();
	
	

	@Before
	public void setUp() throws Exception {
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
	}
	@After
	public void afterInvokeTestMethod(){
		IdentityService identityService = activitiRule.getIdentityService();
		identityService.deleteMembership("henryyan", "deptLeader");
		identityService.deleteGroup("deptLeader");
		identityService.deleteUser("henryyan");
	}
		
	@Test
	
	public void testUserAndGroupInUserTask() throws Exception{
		
		RepositoryService repositoryService = activitiRule.getRepositoryService();
		repositoryService.createDeployment().addInputStream("myProcess.bpmn20.xml",
				new FileInputStream(filename)).deploy();
		RuntimeService runtimeService = activitiRule.getRuntimeService();
		Map<String, Object> variableMap = new HashMap<String, Object>();
		variableMap.put("name", "Activiti");
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("userAndGroupInUserTask");
		assertNotNull(processInstance);
		assertNotNull(processInstance.getId());
		
		TaskService taskService = activitiRule.getTaskService();
		Task task = taskService.createTaskQuery().taskCandidateUser("henryyan").singleResult();
		taskService.claim(task.getId(), "henryyan");
		taskService.complete(task.getId());
		
		System.out.println("id " + processInstance.getId() + " "
				+ processInstance.getProcessDefinitionId());
	}
}