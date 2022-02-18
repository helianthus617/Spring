package com.atguigu.test;
import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;
public class Experiment12Test {
	private ConfigurableApplicationContext ioc =
	new ClassPathXmlApplicationContext("experiment12.xml");
//实验12：引用外部属性文件★
	/*
	 * 知识点1 通过类型获取时 可以使用Datasouce接口获取
	 * ComboPooledDataSource 类实现了  javax.sql.DataSource; 
	 * ★按照类型获取组件时,可以获取到这个类型下的所有实现类子类等等...
	 * DataSource bean = ioc.getBean(DataSource.class);
	 * 知识点2 利用外部文件xxx.properties进行赋值
	 *	第一步先导入名称空间指定 外部文件位置
			<context:property-placeholder location="classpath:dbconfig.properties" />
		第二步再${}表达式进行赋值,<property name="user" value="${jdbc.username}"></property>
	 * */
	@Test
	public void test() {
		ComboPooledDataSource bean = (ComboPooledDataSource) ioc.getBean("dataSource1");
		System.out.println(bean);
	}
}
