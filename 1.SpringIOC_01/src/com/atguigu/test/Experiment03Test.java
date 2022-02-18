package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Experiment01;
import com.atguigu.bean.Experiment03;


public class Experiment03Test {
	/**
    实验3：
    通过构造器为bean的属性赋值（index,type属性介绍）
    通过p名称空间为bean赋值
知识点:	
	1),构造器注入
 1.1 常规方式构造器注入
<!--public Experiment03(String lastName, Integer age, String gender,String email) -->
<bean id="exp01"  class="com.atguigu.bean.Experiment03">
<constructor-arg name="lastName" value="小天"></constructor-arg>
<constructor-arg name="age" value="18" ></constructor-arg>
<constructor-arg name="email" value="zhangsan@atguigu.com" ></constructor-arg>
<constructor-arg name="gender" value="男"></constructor-arg></bean>
 1.2索引方式进行构造器注入,索引从0开始,可省略name属性 
<bean id="exp02"  class="com.atguigu.bean.Experiment03">
<constructor-arg  value="小派"></constructor-arg>
<constructor-arg  value="18" ></constructor-arg>
<constructor-arg  value="男" index="3"></constructor-arg>
<constructor-arg  value="zhangsan@atguigu.com"  index="2"></constructor-arg> 
</bean>
 1.3指定部分参数类型的方式进行构造器注入,解决构造器重载的情况  
  1),<constructor-arg的标签数量决定使用是几个参数的构造器
  2),Experiment03(String lastName, Integer age, String gender)
    Experiment03(String lastName, String email, String gender)
<bean id="exp03"  class="com.atguigu.bean.Experiment03">
<constructor-arg  value="小派"></constructor-arg>
<constructor-arg  value="18" index="1"  type="java.lang.Integer"></constructor-arg>
<constructor-arg  value="男" ></constructor-arg>
</bean>
	2),通过p名称空间为bean赋值 ,P名称空间也是通过set属性值的方式进行赋值的
<!-- 通过p名称空间为bean赋值 名称空间,名称空间在xml中是用来防止标签重复的.导入名称空间 点击Namespaces-->
<bean id="exp04"  class="com.atguigu.bean.Experiment03"
p:age="18" p:email="xiaoli@guigu.com" p:lastName="小夏" p:gender="男">
</bean>
*/
	@Test
	public void test() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment03.xml");
		Experiment03 Experiment01 = (Experiment03)ioc.getBean("exp01"); 
		Experiment03 Experiment02 = (Experiment03)ioc.getBean("exp02"); 
		Experiment03 Experiment03 = (Experiment03)ioc.getBean("exp03"); 
		Experiment03 Experiment04 = (Experiment03)ioc.getBean("exp04"); 
		System.out.println(Experiment01);
		System.out.println(Experiment02);
		System.out.println(Experiment03);
		System.out.println(Experiment04);
	}
}
