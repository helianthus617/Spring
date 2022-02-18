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
import com.atguigu.inter.Calculator_07;
import com.atguigu.proxy.CalculatorlatorProxy_01;

public class AOPTest_08 {
/*
多切面的通知方法执行顺序
1无环绕通知的情况:
A前置 add方法准备执行参数为[1, 0]
B前置ValidateAspect方法输出add方法准备执行参数为[1, 0]
内部方法执行
B后置ValidateAspect方法输出方法结束
B方法返回ValidateAspect方法输出方法正常返回,计算的结果是1
A后置方法结束
A方法返回方法正常返回,计算的结果是1 
执行顺序为A(B()),从左向右,A和B的顺序是由AB类的首字母大小写决定的
2有环绕通知的情况:
add环绕前置通知 方法执行开始
add方法准备执行参数为[1, 0]
ValidateAspect方法输出add方法准备执行参数为[1, 0]
内部方法执行
ValidateAspect方法输出方法结束
ValidateAspect方法输出方法正常返回,计算的结果是1
add环绕返回通知 方法的返回值是1
add环绕后置通知 方法执行结束
方法结束
方法正常返回,计算的结果是1
 * */
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("aop08.xml");
		Calculator_07 bean = (Calculator_07) ioc.getBean("myMathCalculator_07");
		bean.add(1, 0);
		System.out.println(bean.getClass());
	}
}
