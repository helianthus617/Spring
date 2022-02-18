package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.dao.BookDao_Exper15;
import com.atguigu.service.BookService_Exper15;
import com.atguigu.servlet.BookServlet_Exper15;

public class IOCTEST16 {
//	实验16：使用context:include-filter指定扫描包时要包含的类
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc16.xml");
		//注解方式
		Object bean = ioc.getBean("bookDao_Exper16");
		//全类名方式
		Object bean1 = ioc.getBean("bookService_Exper16");
		System.out.println(bean1);
	}

}
