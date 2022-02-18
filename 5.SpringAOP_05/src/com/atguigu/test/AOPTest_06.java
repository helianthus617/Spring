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
import com.atguigu.inter.Calculator_06;
import com.atguigu.proxy.CalculatorlatorProxy_01;

public class AOPTest_06 {
/*
 * 测试环绕通知
 * */
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("aop06.xml");
		Calculator_06 bean = (Calculator_06) ioc.getBean("myMathCalculator_06");
		bean.div(1, 0);
		System.out.println(bean.getClass());
	}
}
