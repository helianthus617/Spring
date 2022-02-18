package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.dao.BookDao_Exper15;
import com.atguigu.service.BookService_Exper15;
import com.atguigu.servlet.BookServlet_Exper15;
import com.atguigu.servlet.BookServlet_Exper18;
import com.atguigu.servlet.BookServlet_Exper19;
//实验19：如果资源类型的bean不止一个，
public class IOCTEST19 {
	/*
	<!-- 
	实验19：如果@Autowired资源类型的bean不止一个
		@Autowired
		private BookService_Exper19 bookService_Exper19;
		执行流程   ①先按照类型去容器中找对应的组件 
										   						 找到一个======> 找到就赋值
										  						 没找到   ======>  抛出异常
		class BookServiceExt_Exper19 extends BookService_Exper19 找到多个======>②按照变量名(bookService_Exper19)继续匹配，	
																				 找到一个======> 找到就赋值
														  						 没找到   ======>  抛出异常
	-->
	**/
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc19.xml");
		BookServlet_Exper19 bean = (BookServlet_Exper19) ioc.getBean("bookServlet_Exper19");
		bean.doGet();
	}

}
