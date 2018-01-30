package me.kafeitu.activiti.chapter6;

import static org.junit.Assert.*;

import javax.swing.JButton;

import me.kafeitu.activiti.AbstractTest;

import org.activiti.engine.form.StartFormData;
import org.activiti.engine.form.TaskFormData;
import org.activiti.engine.impl.form.FormEngine;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.test.Deployment;
import org.junit.Test;

public class MyFormEngineTest extends AbstractTest{
	
	@Test
	@Deployment(resources = { "chapter6/leave-formkey/leave-formkey.bpmn",
							  "chapter6/leave-formkey/leave-start.form"})
	public void allPass(){
		ProcessDefinition processDefinition = repositoryService
												.createProcessDefinitionQuery().singleResult();
		//读取启动表单
		Object renderedStartForm = formService
									.getRenderedStartForm(processDefinition.getId(), "myformengine");
		//验证表单对象
		assertNotNull(renderedStartForm);
		assertTrue(renderedStartForm instanceof javax.swing.JButton);
		javax.swing.JButton button = (JButton) renderedStartForm;
		assertEquals("My Start Form Button", button.getName());
	}

}
