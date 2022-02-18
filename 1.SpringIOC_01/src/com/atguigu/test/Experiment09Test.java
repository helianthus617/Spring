package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Book_Experiment09;
import com.atguigu.bean.Car_Experiment04;
import com.atguigu.bean.Car_Experiment09;
import com.atguigu.bean.Experiment01;
import com.atguigu.bean.Person_Experiment04;
import com.atguigu.bean.Person_Experiment06;
import com.atguigu.bean.Person_Experiment07;

public class Experiment09Test {

	@Test
	public void test1() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment09.xml");
//		  <!--  实验9：测试bean的作用域，分别创建单实例和多实例的bean★ 
//		  prototype 多实例
//		  	1),容器启动默认不会创建对象,获取时创建对象,每次getBean()获取都会创建new新的对象
//		  singleton 默认单实例
//		  	1),在容器启动完成之前就已经创建好对象了。
//		  request 在web环境下,同一次请求创建一个Bean实例
//		  session 在web环境下,同一次会话创建一个Bean实例
//		  知识点：ioc考虑为什么默认是单例的,
//			因为容器里的大多数对象是具有功能的service类,而不是普通的bean(person,car...)对象,
//		        对于有功能的service类来讲,内存中只需要一个即可,哪个类需要哪个类autowired注入即可。
//		   -->
		 Car_Experiment09 car1 = ioc.getBean("car",Car_Experiment09.class);
		 Car_Experiment09 car2 = ioc.getBean("car",Car_Experiment09.class);
		 Book_Experiment09 bean3 = ioc.getBean("book",Book_Experiment09.class);
		 Book_Experiment09 bean4 = ioc.getBean("book",Book_Experiment09.class);

	}	
	
}

	


