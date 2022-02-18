package com.atguigu.test;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.inter.Calculator_01;

public class AOPTest_01 {
	/*
	 * 重要的组件用配置,不重要的用注解.外界的jar包只能使用xml配置
	 * */
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("aop01.xml");
		Calculator_01 bean = ioc.getBean(Calculator_01.class);
		bean.add(1, 2);
	}
}
