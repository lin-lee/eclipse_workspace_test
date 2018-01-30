package me.kafeitu.activiti.chapter6;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.history.HistoricDetail;
import org.activiti.engine.history.HistoricFormProperty;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricVariableUpdate;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.test.Deployment;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.kafeitu.activiti.AbstractTest;

public class LeaveDynamicFormTest extends AbstractTest{
	private static final Logger log = LoggerFactory.getLogger(LeaveDynamicFormTest.class);
//	@Test
//	@Deployment(resources = "chapter6/dynamic-form/leave.bpmn")
//	public void allApproved() {
//		String currentUserId = "henryyan";
//		identityService.setAuthenticatedUserId(currentUserId);
//		//启动流程
//		ProcessDefinition processDefinition = repositoryService
//						.createProcessDefinitionQuery().processDefinitionKey("leave").singleResult();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Map<String, String> variables = new HashMap<String, String>();
//		Calendar ca = Calendar.getInstance();
//		String startDate = sdf.format(ca.getTime());
//		ca.add(Calendar.DAY_OF_MONTH, 2);
//		String endDate = sdf.format(ca.getTime());
//		
//		variables.put("startDate", startDate);
//		variables.put("endDate", endDate);
//		variables.put("reason", "公休");
//		//使用FormService的启动流程方法
//		ProcessInstance processInstance =
//				formService.submitStartFormData(processDefinition.getId(), variables);
//		
//		assertNotNull(processInstance);
//		//部门领导审批通过
//		Task deptLeaderTask = taskService.createTaskQuery()
//								.taskCandidateGroup("deptLeader").singleResult();
//		variables = new HashMap<String, String>();
//		variables.put("deptLeaderApproved", "true");	//设置审批通过标志
//		formService.submitTaskFormData(deptLeaderTask.getId(), variables);
//		//人事审批通过
//		Task hrTask = taskService.createTaskQuery().taskCandidateGroup("hr").singleResult();
//		
//		variables = new HashMap<String, String>();
//		variables.put("hrApproved", "true");
//		formService.submitTaskFormData(hrTask.getId(), variables);
//		//销假（根据申请人的用户ID读取)
//		Task reportBackTask = taskService.createTaskQuery().taskAssignee(currentUserId).singleResult();
//		variables = new HashMap<String, String>();
//		variables.put("reportBackDate", sdf.format( ca.getTime() ));	//设置销假日期
//		formService.submitTaskFormData(reportBackTask.getId(), variables);
//		//验证流程是否已经结束
//		HistoricProcessInstance historicProcessInstance = historyService
//				.createHistoricProcessInstanceQuery().finished().singleResult();
//		assertNotNull(historicProcessInstance);
//		//读取历史变量
//		Map<String, Object> historyVariables = packageVariables(processInstance);
//		//验证执行结果
//		assertEquals("ok", historyVariables.get("result"));
//	}
	
	/**
	 * 领导驳回后申请人取消申请
	 */
	@Test
	@Deployment(resources = "chapter6/dynamic-form/leave.bpmn")
	public void cancelApply(){
		//设置当前用户
		String currentUserId = "henryyan";
		identityService.setAuthenticatedUserId(currentUserId);
		
		ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
												.processDefinitionKey("leave").singleResult();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Map<String, String> variables = new HashMap<String, String>();
		Calendar ca = Calendar.getInstance();
		String startDate = sdf.format(ca.getTime());
		ca.add(Calendar.DAY_OF_MONTH, 2);
		String endDate = sdf.format(ca.getTime());
		
		//启动流程
		variables.put("startDate", startDate);
        variables.put("endDate", endDate);
        variables.put("reason", "公休");
        ProcessInstance processInstance = formService.submitStartFormData(processDefinition.getId(), variables);
        assertNotNull(processInstance);

        // 部门领导审批不通过
        Task deptLeaderTask = taskService.createTaskQuery().taskCandidateGroup("deptLeader").singleResult();
        variables = new HashMap<String, String>();
        variables.put("deptLeaderApproved", "false");
        formService.submitTaskFormData(deptLeaderTask.getId(), variables);

        // 调整申请
        Task modifyApply = taskService.createTaskQuery().taskAssignee(currentUserId)
        		.singleResult();
        variables = new HashMap<String, String>();
        variables.put("reApply", "false");
        variables.put("startDate", startDate);
        variables.put("endDate", endDate);
        variables.put("reason", "公休");
        formService.submitTaskFormData(modifyApply.getId(), variables);
        
        //读取历史变量
        Map<String, Object> historyVariables = packageVariables(processInstance);
        
        //验证执行结果
        assertEquals("canceled", historyVariables.get("result"));
		
	}
	//读取历史变量
	private Map<String, Object> packageVariables(ProcessInstance processInstance){
		Map<String, Object> historyVariables = new HashMap<String, Object>();
		List<HistoricDetail> list = historyService.createHistoricDetailQuery()
									.processInstanceId(processInstance.getId()).list();
		for(HistoricDetail historicDetail : list){
			if(historicDetail instanceof HistoricFormProperty){//表单中的字段
				HistoricFormProperty field = (HistoricFormProperty) historicDetail;
				historyVariables.put(field.getPropertyId(), field.getPropertyValue());
				log.info("form field: taskId=" + field.getTaskId() + ","
						+ field.getPropertyId() + " = " + field.getPropertyValue());
			}else if(historicDetail instanceof HistoricVariableUpdate){//普通变量
				HistoricVariableUpdate variable = (HistoricVariableUpdate)
						historicDetail;
				historyVariables.put(variable.getVariableName(), variable.getValue());
				log.info("variable: " + variable.getVariableName() + " = " 
							+ variable.getValue());
			}
		}
		return historyVariables;
	}

}
