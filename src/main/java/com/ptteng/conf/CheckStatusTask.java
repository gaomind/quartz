package com.ptteng.conf;

import com.ptteng.dao.MybatisDemoMapper;
import com.ptteng.pojo.MybatisDemo;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ${MIND-ZR} on 2018/1/14.
 */
public class CheckStatusTask implements Job {
    private Logger log = Logger.getLogger(CheckStatusTask.class);

    @Autowired
    MybatisDemoMapper mybatisDemoMapper;

    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("===============定时刷新z_check_evaluate里的checkStatus 开始==============");
        MybatisDemo mybatisDemo=new MybatisDemo();
        mybatisDemo.setmAge(11);
        mybatisDemo.setmName("小三");

        int result = mybatisDemoMapper.insert(mybatisDemo);
        if (result > 0)
            log.info("===============定时刷新z_check_evaluate里的checkStatus 成功==============个数："+result);
    }

}
