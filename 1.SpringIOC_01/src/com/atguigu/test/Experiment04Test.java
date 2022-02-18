package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Car_Experiment04;
import com.atguigu.bean.Experiment01;

import com.atguigu.bean.Person_Experiment04;

public class Experiment04Test {
	/**
	实验4：正确的为各种属性赋值
    1),测试使用null值 、
    2),引用类型赋值（引用其他bean、引用内部bean）
    3),集合类型赋值（List、Map、Properties）、
    4),util名称空间创建集合类型的bean
    5),级联属性赋值
    知识点
  1),测试使用null值
    基本类型直接使用property标签进行赋值,<property name="lastName" value="张三"></property>
    空值赋值使用 <null/>的方式,  
  null值的使用场景是针对private String lastName="小天" 
    这种提前已经赋初值的场景使用再赋null值进行覆盖;
  2.1), 引用类型赋值（引用其他bean
    如果一个组件内的属性是引用了容器中的其他的组件,
    例如Person的car属性引用了car组件.那么该属性值与另一个组件是同一个对象,且还是通过set属性的方式进行注入
    等价于 setCar(ioc.getBean("car"))	
  2.2), 引用类型赋值（引用内部bean）
	 <bean id="person03" class="com.atguigu.bean.Person_Experiment04">
	 <property name="car" >
	 	<!-- 对象我们可以使用bean 标签创建 car =new Car() -->
	 	<bean class="com.atguigu.bean.Car_Experiment04">
		 <property name="carName" value="自行车"> </property>
   引用内部bean对象与容器中的bean对象不是同一个. getCar()!=ioc.getBean("car"),
   内部bean 本质就是新new了一个对象
  3),集合类型赋值（List、Map、Properties）
  <list>标签 本质是  books =new ArrayList,
   List集合中的对象可以是内部bean也可以是引用容器中的其他bean对象
   <!-- 水浒传采用的是内部bean的方式 ,内部bean不能从ioc容器中直接获取,所以设置id获取无意义 -->
	<bean id ="innerbean" class="com.atguigu.bean.Book_Experiment04"> 
	<property name="bookName" value="水浒传"> 
	内部bean不能从ioc容器中直接获取 ioc.getBean("innerbean") 该语句报异常,未找到该bean对象。
	<list>标签完整如下:	
		<list>	
			 <bean id ="innerbean" class="com.atguigu.bean.Book_Experiment04"> 
		     <property name="bookName" value="水浒传">  </property> </bean> 	
		     <!-- 引用容器中的其他bean对象 -->
			 <ref bean="book01"/> 
		</list>
		
	map:赋值,可使用内部bean,也可引用容器中其他的bean
	<property name="maps">
		<map>
			<entry key="key01" value="张三"></entry>
			<entry key="key02" value="18"></entry>
			<entry key="key03" value-ref="book01"></entry>
			<entry key="key04" >
				<bean class="com.atguigu.bean.Car_Experiment04">
					<property name="carName" value="宝马">
					</property>
				</bean>
			</entry>
		</map>
	</property>
	
	property赋值: 
	<property name="properties">
	<props>
	<!-- k=v=string -->
		<prop key="username">root</prop>
		<prop key="password">123456</prop>
	</props>	
	</property>
	4),util名称空间创建集合类型的bean,先导入名称空间,
	定义:
	<util:map id="myMap">
	<!-- util名称空间创建集合类型的bean 相当于 new linkedHashMap<>()--> 
			<entry key="key01" value="张三"></entry>
			<entry key="key02" value="18"></entry>
	使用:
		 <bean id="person06" class="com.atguigu.bean.Person_Experiment04">
 		 <property name="maps" ref="myMap"></property>		
	5),级联属性赋值-给组件的属性引用一个容器中对象的时候,使用时可以直接修改被引用对象的属性值
*/
//	测试使用null值 、
	@Test
	public void test() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment04.xml");
		Person_Experiment04 test_null = (Person_Experiment04) ioc.getBean("person01");
		System.out.println(test_null);
	}
//	引用类型赋值,引用其他bean
	@Test
	public void test1() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment04.xml");
		Person_Experiment04 person02 = (Person_Experiment04) ioc.getBean("person02");
		Car_Experiment04 car02 = (Car_Experiment04) ioc.getBean("car01");
		System.out.println(person02.getCar()==car02);
	}
	
//	引用类型赋值,引用内部bean
	@Test
	public void test2() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment04.xml");
		Person_Experiment04 person03 = (Person_Experiment04) ioc.getBean("person03");
		Person_Experiment04 person04 = (Person_Experiment04) ioc.getBean("person03");
		System.out.println(person03.getCar()==person04.getCar());
	}	
		
//	集合类型赋值（List、Map、Properties）
	@Test
	public void test3() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment04.xml");
		Person_Experiment04 person04 = (Person_Experiment04) ioc.getBean("person04");
		System.out.println(person04.getBooks());
	}	
//	集合类型赋值（Map、Properties）	
	@Test
	public void test4() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment04.xml");
		Person_Experiment04 person05 = (Person_Experiment04) ioc.getBean("person05");
		System.out.println(person05.getProperties());
		System.out.println(person05.getMaps());
	}	
//	util名称空间创建集合类型的bean	
	@Test
	public void test5() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment04.xml");
		Person_Experiment04 person06 = (Person_Experiment04) ioc.getBean("person06");
		System.out.println(person06.getMaps());
	}	
	
//	级联属性赋值	
	@Test
	public void test6() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment04.xml");
		Person_Experiment04 person07 = (Person_Experiment04) ioc.getBean("person07");
		System.out.println(person07.getCar());
	}	
	
}
