package com.atguigu.test;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.impl.MyMathCalculator_01;
import com.atguigu.impl.MyMathCalculator_03;
import com.atguigu.inter.Calculator_01;
import com.atguigu.inter.Calculator_02;
import com.atguigu.inter.Calculator_04;
import com.atguigu.inter.Calculator_05;
import com.atguigu.proxy.CalculatorlatorProxy_01;

public class AOPTest_05 {
/*
1.	拿到执行方法的详细信息
2.	使用throwing,和returning 属性	
3.  知识点:1. spring对通知方法要求不严格,但是要确保方法参数正确
	知识点:2	 注意:logReturn(Object arg1) / logException(Exception e),如果指定异常类型和返回值的类型,
 * 如果抛出的异常与指定的异常不相同的话,该异常通知方法不会被调用,返回值类型也同理
	知识点:3可重用的切入点表达式:随便没有实现且返回为空的方法,给方法加入	 	
 * */
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("aop05.xml");
		Calculator_05 bean = (Calculator_05) ioc.getBean("myMathCalculator_05");
		try {
			int add = bean.add(1, 0);
		} catch (Exception e) {
		
		}
		System.out.println(bean.getClass());
	}
}
