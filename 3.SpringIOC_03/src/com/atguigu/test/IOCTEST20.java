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
import com.atguigu.servlet.BookServlet_Exper15;
import com.atguigu.servlet.BookServlet_Exper18;
import com.atguigu.servlet.BookServlet_Exper19;
import com.atguigu.servlet.BookServlet_Exper20;
/*
 * 实验20：如果根据成员变量名作为id还是找不到bean，
       可以使用@Qualifier注解明确指定目标bean的id★
   	知识点1:@Qualifier("bookServiceExt_Exper20")  指定一个id进行查找,与变量名无关.找不到,报异常
   	知识点2:@Autowired标注的属性,属性没有注入值则报错.
	@Autowired
	private BookService_Exper20 bookService_Exper201;
 * */
public class IOCTEST20 {
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc20.xml");
		BookServlet_Exper20 bean = (BookServlet_Exper20) ioc.getBean("bookServlet_Exper20");
		bean.doGet();
	}
}
