package com.atguigu.test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.atguigu.service.BookService_01;
/*
 * 事务细节
 */
public class Txtest_01 {
	ApplicationContext ioc =
			new ClassPathXmlApplicationContext("ApplicationContext_01.xml");
	@Test
	public void test() {
		BookService_01 bean = ioc.getBean(BookService_01.class);
		System.out.println(bean.getClass());
		
	}
}
