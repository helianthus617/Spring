package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Experiment11Test {

	private ConfigurableApplicationContext ioc =new ClassPathXmlApplicationContext("experiment11.xml");
//实验11：测试bean的后置处理器
	@Test
	public void test() {
	System.out.println("容器关闭了");
	ioc.close();
/*
Book_Experiment10无参构造器输出
setBookName 方法输出的	水浒传
exp01bean 将要调用初始化方法了.postProcessBeforeInitialization 输出的该语句
这是Book_Experiment10类定义的myInit()方法输出的
exp01bean 已经调用完初始化方法了.postProcessAfterInitialization 输出的该语句
容器关闭了
这是Book_Experiment10类定义的myDestory()方法输出的
**/
	}
}
