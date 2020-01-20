package com.example.demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    RuntimeService runtimeService;
    @Autowired
    TaskService taskService;

    @Test
    void contextLoads() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        Deployment deployment = processEngine.getRepositoryService()//获取流程定义和部署对象相关的Service
                .createDeployment()//创建部署对象
                .name("helloworld")//声明流程的名称
                .addClasspathResource("processes/hello.bpmn")//加载资源文件，一次只能加载一个文件
                .deploy();//完成部署
        System.out.println("aaa");
    }
    @Test
    void startProcess() {
   ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("oneTaskProcess");
        System.out.println("流程启动成功"+processInstance.getName());
    }
    @Test
    void complete(){
        Task task =  taskService.createTaskQuery().processInstanceId("5001").singleResult();
            System.out.println(task.getCreateTime());
            taskService.complete("5005");
            System.out.println("张三审批完成");
    }
}
