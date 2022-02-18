package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Experiment01;


public class Experiment01Test {
	/**
知识点:	
1),src 源码包开始的路径成为类路径的开始
	所有源码包里面的东西都会被合并放在类路径里面;
	JAVA: /bin/
	WEB:/web-inf/classes/
2),导包common-logging-1.1.3.jar
3),先导包在创建配置文件 spring bean configuration file
4),Spring的容器接管标志了S的类. 
细节:
	4.1)FileSystemXmlApplicationContext ioc容器的配置文件在类路径下;
	ClassPathXmlApplicationContext ("f://xx.xml")
	4.2)容器中对象的创建时机在创建容器时就创建成功 	
	ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml"); 
    public Person() {
		super();
		System.out.println("对象创建完成");
	}
    4.3),同一个组件在ioc容器中是单实例的,容器启动时就已经完成了.
		Person person01 = (Person)ioc.getBean("person01"); 
		Person person011 = (Person)ioc.getBean("person01"); 
		System.out.println(person011==person01);  //true
	4.4),如果没有这个组件,获取报异常
	Person person011 = (Person)ioc.getBean("person03"); 
	org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'person03' is defined
	
	4.5),	public void setLastName(String lastName) {
		System.out.println("lastName  "+lastName);
		this.lastName = lastName; }
	ioc容器在创建这个组件的时候(property)会利用setter方法为javaBean的属性赋值
	4.6), javaBean的属性名是由什么决定的?
		getter/setter方法是属性名;set去掉后面那一串字母小写就是属性名
		public void setLastName(String lastName) {
		System.out.println("lastName  "+lastName);
		this.lastName = lastName;} 
		
5),
<!--  注册一个spring对象-->
<!-- 一个bean标签可以注册一个组件(对象,类)
,class:写要注册的组件全类名  ALT+/ 提示
,id: 这个对象的唯一标识 -->
<bean id="exp01"  class="com.atguigu.bean.Experiment01">
<!-- 使用property 标签为Person对象属性赋值,需生成get/set 以及必须包含无参构造器
,name="lastName":指定属性名
,value="张三":为这个属性赋值-->
<property name="lastName" value="张三"></property>

总结:不需要自己创建new 对象了,容器会帮你自动的创建出来对象,可以通过id获得指定的组件对象
*/
		
// 从容器中拿到这个组件
//	实验1：通过IOC容器创建对象，并为属性赋值★
	@Test
	public void test() {
		// ApplicationContext 代表IOC容器
		// 根据spring的配置文件得到ioc容器对象
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment01.xml");
		System.out.println("容器启动完成 ......");
		//getBean通过id的方式获取bean
		Experiment01 Experiment01 = (Experiment01)ioc.getBean("exp01"); 
		System.out.println(Experiment01);
		//我们从容器拿对象,我们不负责创建对象
		//Person [lastName=张三, age=18, gender=男, email=zhangsan@atguigu.com]
		//同一个组件在ioc容器中是单实例的
		Experiment01 exp011 = (Experiment01)ioc.getBean("exp01"); 
		Experiment01 exp012 = (Experiment01)ioc.getBean("exp01"); 
		System.out.println(exp012==exp011);  //true
	}
}
