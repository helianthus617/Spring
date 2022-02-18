package com.atguigu.test;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.atguigu.impl.MyMathCalculator_01;
import com.atguigu.inter.Calculator_01;
import com.atguigu.proxy.CalculatorlatorProxy_01;

public class AOPTest_01 {
/*
 * JDK动态代理的使用
 * 知识点:
 * 	Object proxy1= Proxy.newProxyInstance(loader, interfaces, h)
 *  动态代理proxy1对象是com.sun.proxy.$Proxy2
 * */
	@Test
	public void test() {
		Calculator_01 new_calculator =new MyMathCalculator_01();
		// 传入被代理的对象calculator
		Calculator_01 proxy = CalculatorlatorProxy_01.getProxy(new_calculator);
		proxy.add(1,2);
		System.out.println(proxy.getClass());
	}
}
