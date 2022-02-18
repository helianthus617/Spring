package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Experiment01;
import com.atguigu.bean.Experiment02;


public class Experiment02Test {
	/*实验2：根据bean的类型从IOC容器中获取bean的实例★
	 * 知识点
	 * 1),
	<bean id="exp01"  class="com.atguigu.bean.Experiment02">
	<property name="lastName" value="张三"></property>
	</bean>
	<bean id="exp02"  class="com.atguigu.bean.Experiment02">
	<property name="lastName" value="小娟"></property>
	</bean>
	<!-- 通过类型获取的方式时,容器中有两个相同的类型组件时报错
	org.springframework.beans.factory.NoUniqueBeanDefinitionException:
	 No qualifying bean of type [com.atguigu.bean.Experiment02]
	  is defined: expected single matching bean but found 2: exp01,exp02
	-->
 	 * 2),
 	 通过类型获取的时候,不需要强制类型转换 ioc.getBean(Experiment02.class); 
	 * 3),
		有多个相同类型组件时,也可以不通过强制类型转换的方式
		Experiment02 Experiment02 = ioc.getBean("exp01",Experiment02.class); 
	 * */
	@Test
	public void test() {
		// ApplicationContext 代表IOC容器
		// 根据spring的配置文件得到ioc容器对象
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment02.xml");
		System.out.println("容器启动完成 ......");
		//getBean通过类型的方式获取bean对象
		Experiment02 Experiment02 	 =	ioc.getBean(Experiment02.class); 
		System.out.println(Experiment02);
		//有多个相同类型组件时,也可以不通过强制类型转换的方式
		//Experiment02 Experiment02 = ioc.getBean("exp01",Experiment02.class); 
		//System.out.println(Experiment02);
		}
}
