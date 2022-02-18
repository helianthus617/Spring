package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.dao.BookDao_Exper15;
import com.atguigu.service.BookService_Exper15;
import com.atguigu.servlet.BookServlet_Exper15;

public class IOCTEST15 {
	/**
	<!-- 实验15：通过注解分别创建Dao、Service、Controller★ 
	通过给bean 上添加注解,可以快速的将bean加入到ioc容器中
	Spring有四个注解:
	1),Controller:控制器,我们推荐给控制器层Servlet包下的组件加这个注解
	2),Service:业务逻辑,我们推荐给业务逻辑层service包下的组件加这个注解
	3),Repository:持久层,我们推荐给持久层Dao包下的组件加这个注解
	4),Component:组件层,不属于以上层的组件添加这个注解
	知识点：  1),使用注解将组件快速的加入到容器中需要几步
			1.1): 给需要添加的组件上标四个注解的任意一个
			1.2): 告诉spring,自动扫描加了注解的组件,依赖context名称空间
			1.3): 支持注解的模式需要导入AOP包 spring-aop-4.0.0.RELEASE
	 		2), 默认id为类名小写.
  			3), 修改组件id, /@Controller("bean对象的id"), 
  				/@@Service("bean对象的id"),/@Repository("bean对象的id"),/@Component("bean对象的id")
 			4), 修改组件的单多实例属性,设置bean为多实例---> 类上添加注解@Scope(value="prototype")	
		
	-->
<!-- context:component-scan 自动组件扫描 
 base-package="指定扫描的基础包;把基础包以及他下面所有的包的所有加了注解的类添加进容器"
 默认id为类名小写.
 -->
 **/
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("ioc15.xml");
		BookDao_Exper15 bean1 = (BookDao_Exper15) ioc.getBean("bookDao_Exper15");
		BookDao_Exper15 bean11 = (BookDao_Exper15) ioc.getBean("bookDao_Exper15");
		BookService_Exper15 bean2 = ioc.getBean(BookService_Exper15.class);
		BookServlet_Exper15 bean3 = ioc.getBean(BookServlet_Exper15.class);
		System.out.println("是单例的吗 ?"+(bean1==bean11));
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
	}

}
