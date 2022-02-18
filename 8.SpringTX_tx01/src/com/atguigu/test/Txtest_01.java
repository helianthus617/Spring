package com.atguigu.test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.atguigu.service.BookService_01;
/*事务体验-※配置事务管理器
com.springsource.net.sf.cglib-2.2.0.jar
com.springsource.org.aopalliance-1.0.0.jar
com.springsource.org.aspectj.weaver-1.6.8.RELEASE.jar
spring-aspects-4.0.0.RELEASE.jar
*/
public class Txtest_01 {
	ApplicationContext ioc =
			new ClassPathXmlApplicationContext("ApplicationContext_01.xml");
	@Test
	public void test() {
		BookService_01 bean = ioc.getBean(BookService_01.class);
		bean.checkout("Jerry", "ISBN-001");
	}
}
