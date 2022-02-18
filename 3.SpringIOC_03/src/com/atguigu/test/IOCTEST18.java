package com.atguigu.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.dao.BookDao_Exper15;
import com.atguigu.service.BookService_Exper15;
import com.atguigu.servlet.BookServlet_Exper15;
import com.atguigu.servlet.BookServlet_Exper18;
//使用@Autowired注解实现根据类型实现自动装配★
//知识点1:@Autowired注解与set属性方法无关,可以不写set属性方法,并且可以修改set属性方法.
//@Autowired/@Resource 都是自动装配的意思,@Resource是javaee的标准，@Resource的扩展性更强
public class IOCTEST18 {

	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc18.xml");
		BookServlet_Exper18 bean = (BookServlet_Exper18) ioc.getBean("bookServlet_Exper18");
		bean.doGet();
	}

}
