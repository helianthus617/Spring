package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.service.BookService;
import com.atguigu.service.UserService;
//实验23：测试泛型依赖注入★ 
//依赖注入是通过泛型的值进行参考
public class IOCTEST23 {
	ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc23.xml");
	@Test
	public void test() {
	BookService bean = ioc.getBean(BookService.class);
	UserService bean2 = ioc.getBean(UserService.class);
	bean.save();
	bean2.save();
	System.out.println(bean.getClass().getGenericSuperclass());
	System.out.println(bean2.getClass().getGenericSuperclass());
	}

}
