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

public class AOPTest_07 {
/*
 执行顺序:环绕前置--普通前置--目标方法执行---环绕正常返回/出现异常--环绕后置--普通后置--普通返回或普通异常通知
 注意:只有在环绕通知中将异常抛出去,普通异常通知才能被调用
环绕通知与普通通知执行顺序
add环绕前置通知 方法执行开始
add方法准备执行参数为[1, 0]
add环绕返回通知 方法的返回值是1
add环绕后置通知 方法执行结束
方法结束
方法正常返回,计算的结果是1
出现异常的顺序
div环绕前置通知 方法执行开始
div方法准备执行参数为[1, 0]
div环绕异常通知 方法执行出现异常
div环绕后置通知 方法执行结束
方法结束
方法正常返回,计算的结果是null
 * */
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("aop07.xml");
		Calculator_07 bean = (Calculator_07) ioc.getBean("myMathCalculator_07");
		bean.add(1, 0);
		System.out.println(bean.getClass());
	}
}
