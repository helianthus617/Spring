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
import com.mchange.v2.c3p0.ComboPooledDataSource;
public class Experiment13Test {
	private ConfigurableApplicationContext ioc =
	new ClassPathXmlApplicationContext("experiment13.xml");
/*实验13：基于XML的自动装配,自动装配仅限于对自定义的类有效
 	<!--1), 按照某种规则自动装配
		1.1),default/no 
		1.2),byName 按照名字自动装配 ,set属性的方式
			private Car car 以属性名作为id去容器中找到这个组件,给它赋值,找不到为NULL
		1.3),byType	,set属性的方式
			car=ioc.getBean(Car.class);
			如果没找到则装配null
			如果同一个类型的bean有多个,按照Bean的id进行精确匹配,如果bean的id无法精确匹配则报错.
		1.4),constructor(参数个数相同发生构造器重载时不确定如何赋值,但会优先赋值符合参数数量更多的构造函数)
			1.4.1),构造器的参数都为自定义类型,且该自定义类作为组件已经加入容器
			1.4.2),先按照参数的类型进行查找,如果相同类型的组件有多个,则参数名作为id继续查找,
				存在组件的id与参数名相同则装配成功否则,装配null
			1.4.3),通过构造器自动装配时,不会报异常,如果构造器装配失败则使用无参构造器进行初始化对象.
	 -->
	  2),对于list集合的属性来说,private List<Book_Experiment13> books;
	        设置为byType自动装配的方式，会将容器中所有该类型Book_Experiment13的组件类加入该list集合中
 * */
	@Test	
	public void test() {
		Person_Experiment13 bean = ioc.getBean(Person_Experiment13.class);
		System.out.println(bean);
	}
}
