package com.ptteng.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by ${MIND-ZR} on 2018/1/13.
 */


@Entity
@Table(name = "c_schedule_triggers")
public class CScheduleTrigger {
    @Id
    @GenericGenerator(name = "mysqlNative", strategy = "native")
    @GeneratedValue(generator = "mysqlNative")
    private Integer id;

    @Column
    private String cron;  //时间表达式

    private String status; //使用状态 0：禁用   1：启用

    private String jobName; //任务名称

    private String jobGroup; //任务分组

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getStatus() {
        return status;
    }
}
