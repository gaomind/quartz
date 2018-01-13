package com.ptteng.impl;

import com.ptteng.dao.MybatisDemoMapper;
import com.ptteng.pojo.MybatisDemo;
import com.ptteng.service.InserUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ${MIND-ZR} on 2018/1/13.
 */
@Service
public class InsertStuImpl implements InserUserService{

   @Autowired
    MybatisDemoMapper mybatisDemoMapper;

    @Override
    public void insertUser(MybatisDemo mybatisDemo) {

      int i= mybatisDemoMapper.insert(mybatisDemo);
        System.out.println("插入数据"+i);
    }
}
