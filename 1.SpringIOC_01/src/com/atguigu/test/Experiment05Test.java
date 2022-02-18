package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Book_Experiment09;
import com.atguigu.bean.Car_Experiment04;
import com.atguigu.bean.Car_Experiment09;
import com.atguigu.bean.Experiment01;
import com.atguigu.bean.Person_Experiment04;
import com.atguigu.bean.Person_Experiment06;
import com.atguigu.bean.Person_Experiment07;

public class Experiment05Test {
	//实验5：配置通过静态工厂方法创建的bean、实例工厂方法创建的bean、FactoryBean★
	//FactoryBean是spring提供的一个接口，org.springframework.beans.factory.FactoryBean
	//只要是这个接口的实现类，spring认为这些实现类是工厂对象
/* 知识点
 * 1.无论是静态工厂或者是实例工厂,工厂提供的对象都是单实例的
 * 2.无论是单实例还是多实例都是getbean时创建对象
 * **/
	ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment05.xml");
	@Test
	public void test0501(){
		//单实例，静态工厂
		Object bean = ioc.getBean("airPlane01");
		Object bean2 = ioc.getBean("airPlane01");
		System.out.println(bean==bean2);
	}
	@Test
	public void test0502(){
		//单实例，实例工厂
		Object bean = ioc.getBean("airPlane02");
		Object bean2 = ioc.getBean("airPlane02");
		System.out.println(bean==bean2);
	}
	//实例工厂方法创建的bean、FactoryBean★  ,无论是单实例还是多实例都是getbean时创建对象
	@Test
	public void test0503(){
		//单实例，实例工厂
		Object bean = ioc.getBean("myFactoryBeanImple");
		Object bean2 = ioc.getBean("myFactoryBeanImple");
		System.out.println(bean==bean2);
	}
	
}

	


