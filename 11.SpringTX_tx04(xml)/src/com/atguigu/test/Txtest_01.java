package com.atguigu.test;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Propagation;

import com.atguigu.service.BookService_01;
import com.atguigu.service.Mulservice;
/*
测试xml的事务配置
 */
public class Txtest_01 {
	ApplicationContext ioc =
			new ClassPathXmlApplicationContext("ApplicationContext_01.xml");
	@Test
	public void test() {
		BookService_01 bean = ioc.getBean(BookService_01.class);
		bean.checkout("Tom","ISBN-001");
	}
	@Test
	public void test1() {
		BookService_01 bean = ioc.getBean(BookService_01.class);
		bean.checkout1("Tom","ISBN-001");
	}
//	测试 Mulservice.java
	@Test
	public void test2() {
		Mulservice bean = ioc.getBean(Mulservice.class);
		bean.mult1_new();
	}
	@Test
	public void test3() {
		Mulservice bean = ioc.getBean(Mulservice.class);
		bean.mult1_new1();
	}
	
}
