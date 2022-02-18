package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Experiment10Test {

//实验10：创建带有生命周期方法的bean
	/**单例情况
	*Book_Experiment10无参构造器输出
	*setBookName 方法输出的	水浒传
	*这是Book_Experiment10类定义的myInit()方法输出的
	*容器关闭了
	*这是Book_Experiment10类定义的myDestory()方法输出的
	* *
	/**  多例情况:必须getbean才能创建对象且容器关闭后不销毁对象
	 * Book_Experiment10无参构造器输出
	 *  setBookName 方法输出的	水浒传
	 *  这是Book_Experiment10类定义的myInit()方法输出的
	 *  容器关闭了
	 * */
	@Test
	public void test() {
ConfigurableApplicationContext ioc =new ClassPathXmlApplicationContext("experiment10.xml");
//单例		
		System.out.println("容器关闭了");
		ioc.close();
//多例		
//		Object bean = ioc.getBean("exp02");
//		System.out.println("容器关闭了");
//		ioc.close();
	}
}
