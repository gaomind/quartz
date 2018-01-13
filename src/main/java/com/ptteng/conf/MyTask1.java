package com.ptteng.conf;

import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

/**
 * Created by ${MIND-ZR} on 2018/1/13.
 */
@Component
public class MyTask1 implements Job {


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

            boolean isExecute = false;  //是否已执行业务逻辑
            boolean flag = false;  //业务逻辑执行后返回结果

                System.out.println("执行这个方法");

  }
}