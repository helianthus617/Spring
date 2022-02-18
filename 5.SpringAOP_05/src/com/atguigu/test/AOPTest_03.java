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
import com.atguigu.proxy.CalculatorlatorProxy_01;

public class AOPTest_03 {
/*
 	cglib为没有接口的组件创建代理对象	
 	class com.atguigu.impl.MyMathCalculator_03$$EnhancerByCGLIB$$513d3b18
 * */
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("aop03.xml");
		//没有接口类型就按照本类类型获取MyMathCalculator_03
		MyMathCalculator_03 bean = (MyMathCalculator_03) ioc.getBean("myMathCalculator_03");
		bean.add(1, 2);
		System.out.println(bean.getClass());
	}
}
