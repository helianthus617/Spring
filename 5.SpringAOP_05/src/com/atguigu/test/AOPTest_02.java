package com.atguigu.test;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.impl.MyMathCalculator_01;
import com.atguigu.inter.Calculator_01;
import com.atguigu.inter.Calculator_02;
import com.atguigu.proxy.CalculatorlatorProxy_01;

public class AOPTest_02 {
/*
 * AOP的使用
 * 1),导包:基础包 spring-aspects-4.0.0.RELEASE 
 * 		     加强包 com.springsource.net.sf.cglib-2.2.0.jar,
 * 				com.springsource.org.aspectj.weaver-1.6.8.RELEASE.jar
 * 				com.springsource.org.aopalliance-1.0.0.jar
 * 2),写配置:
 * 		2.1),将目标类和切面类加入到容器中
 * 		2.2),告诉spring那个是切面类@Aspect
 * 		2.3),告诉spring,切面类里面的每个方法,都是何时何地运行并指定切入点表达式 
 * 		2.4),开启基于注解的AOP功能->AOP名称空间
 * 3),测试
 * 		3.1),必须从ioc容器中拿到对象,如果使用的是类型获取,一定是接口类型而不是本类.
 * 知识点1.IOC容器中保存的是组件的代理对象
 * 			通过类型获取或者通过id获取都是代理对象--ioc.getBean(Calculator_02.class)----ioc.getBean("myMathCalculator_02")
 * 		2.AOP的执行顺序 
		正常执行:  @Before-->@After-->@AfterReturning
		异常执行:  @Before-->@After-->@@AfterThrowing
 * */
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("aop02.xml");
		Calculator_02 bean = (Calculator_02) ioc.getBean("myMathCalculator_02");
		bean.add(1, 2);
		System.out.println(bean.getClass());
	}
}
