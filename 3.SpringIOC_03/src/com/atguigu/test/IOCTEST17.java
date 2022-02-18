package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.dao.BookDao_Exper15;
import com.atguigu.service.BookService_Exper15;
import com.atguigu.servlet.BookServlet_Exper15;
//实验17：使用context:exclude-filter指定扫描包时不包含的类
public class IOCTEST17 {

	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc17.xml");
		Object bean = ioc.getBean("bookDao_Exper17");
		System.out.println(bean);
	}

}
