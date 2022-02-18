package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.dao.BookDao_Exper15;
import com.atguigu.service.BookService_Exper15;
import com.atguigu.service.BookService_Exper20;
import com.atguigu.service.BookService_Exper22;
import com.atguigu.servlet.BookServlet_Exper15;
import com.atguigu.servlet.BookServlet_Exper18;
import com.atguigu.servlet.BookServlet_Exper19;
import com.atguigu.servlet.BookServlet_Exper20;
import com.atguigu.servlet.BookServlet_Exper21;
import com.atguigu.servlet.BookServlet_Exper22;
/*
 实验21：在方法的形参位置使用@Qualifier注解
 知识点： 方法的形参位置使用@Qualifier注解也是先按照类型装配--->有多个按照Id进行装配(可以通过@Qualifier注解限定)
 */
public class IOCTEST21 {
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc21.xml");
		BookServlet_Exper21 bean = ioc.getBean(BookServlet_Exper21.class);
		bean.doGet();
	}
}
