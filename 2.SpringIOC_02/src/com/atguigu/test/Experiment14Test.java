package com.atguigu.test;
import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Book_Experiment13;
import com.atguigu.bean.Person_Experiment13;
import com.atguigu.bean.Person_Experiment14;
import com.mchange.v2.c3p0.ComboPooledDataSource;
public class Experiment14Test {
	private ConfigurableApplicationContext ioc =
	new ClassPathXmlApplicationContext("experiment14.xml");
/*
实验14：[SpEL测试I]
    在SpEL中使用字面量、
    引用其他bean、
    引用其他bean的某个属性值、
    调用非静态方法
    调用静态方法、
    使用运算符
 * */
	@Test	
	public void test() {
		Person_Experiment14 bean = ioc.getBean(Person_Experiment14.class);
		System.out.println(bean);
	}
}

