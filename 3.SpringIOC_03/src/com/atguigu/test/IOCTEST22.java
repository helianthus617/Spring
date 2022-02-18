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
import com.atguigu.servlet.BookServlet_Exper22;
/*
 * 实验22：@Autowired注解的required属性指定某个属性允许不被设置
    @Qualifier("bookServiceExt_Exper2212")
	@Autowired(required=false)
	private BookService_Exper22 bookServiceExt_Exper221;
	知识点:@Autowired(required=false) 如果相同类型有多个的清空下,相同类型的异常优先报出。
 * */
public class IOCTEST22 {
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc22.xml");
		BookServlet_Exper22 bean = (BookServlet_Exper22) ioc.getBean("bookServlet_Exper22");
		bean.doGet();
	}
}
