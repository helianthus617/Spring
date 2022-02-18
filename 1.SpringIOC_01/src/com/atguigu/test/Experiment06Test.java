package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Car_Experiment04;
import com.atguigu.bean.Experiment01;
import com.atguigu.bean.Person_Experiment04;
import com.atguigu.bean.Person_Experiment06;

public class Experiment06Test {
//	<!-- 实验6：通过继承实现bean配置信息的重用 -->
	/**
 <!-- 实验6：通过继承实现bean配置信息的重用 -->
 <bean id="person01" class="com.atguigu.bean.Person_Experiment06">
	<property name="lastName" value="张三"></property>
	<property name="age" value="18"></property>
	<property name="gender" value="男"></property>
	<property name="email" value="xxx@qq.com"></property>
 </bean>
 <bean id="person02" class="com.atguigu.bean.Person_Experiment06" parent="person01">
<!--因为是继承所以可以不写class    <bean id="person08"  parent="person07"> -->
<property name="lastName" value="小么"></property>
 </bean>
	 * */
	@Test
	public void test1() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment06.xml");
		Person_Experiment06 person02 = (Person_Experiment06) ioc.getBean("person02");
		System.out.println(person02);
	}	
	
}
