package com.ptteng;

import com.ptteng.pojo.MybatisDemo;
import com.ptteng.service.InserUserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuartzApplicationTests {


	@Autowired
	InserUserService inserUserService;
	@Test
	public void contextLoads() {
		MybatisDemo mybatisDemo=new MybatisDemo();
		mybatisDemo.setmAge(11);
		mybatisDemo.setmName("小三");
		inserUserService.insertUser(mybatisDemo);
	}

}
