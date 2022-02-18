package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Car_Experiment04;
import com.atguigu.bean.Experiment01;
import com.atguigu.bean.Person_Experiment04;
import com.atguigu.bean.Person_Experiment06;
import com.atguigu.bean.Person_Experiment07;

public class Experiment07Test {
	/*
	<!-- 实验7：通过abstract属性创建一个模板bean
	abstract="true" 这个bean 的配置是一个抽象的,不能获取他的实例,只能用来继承
	 -->
	 * */
	@Test
	public void test1() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment07.xml");
/**	Person_Experiment07 person01 = (Person_Experiment07) ioc.getBean("person01");
* BeanIsAbstractException: Error creating bean with name 'person01': Bean definition is abstract
 * */
		Person_Experiment07 person02 = (Person_Experiment07) ioc.getBean("person02");
		System.out.println(person02);
	}	
	
}

	


