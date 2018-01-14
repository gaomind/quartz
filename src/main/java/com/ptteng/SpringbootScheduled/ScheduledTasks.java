package com.ptteng.SpringbootScheduled;

import com.ptteng.pojo.MybatisDemo;
import com.ptteng.service.InserUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 *
 *
 * 这个是springboot自带的定时任务。。注解删除就可以用了。
 *
 * Created by ${MIND-ZR} on 2018/1/13.
 */
//@Component
//@Configurable
//@EnableScheduling
public class ScheduledTasks {
    @Autowired
    InserUserService insertUserService;


    @Scheduled(fixedRate = 1000 * 30)
    public void reportCurrentTime(){
        MybatisDemo mybatisDemo=new MybatisDemo();
        mybatisDemo.setmAge(11);
        mybatisDemo.setmName("小三");
        insertUserService.insertUser(mybatisDemo);
        System.out.println ("Scheduling Tasks Examples: The time is now " + dateFormat ().format (new Date()));
    }

    //每1分钟执行一次
    @Scheduled(cron = "0 */1 *  * * * ")
    public void reportCurrentByCron(){
        System.out.println ("Scheduling Tasks Examples By Cron: The time is now " + dateFormat ().format (new Date ()));
    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }

}

