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
import com.atguigu.proxy.CalculatorlatorProxy_01;

public class AOPTest_04 {
/*//execution(访问修饰符 返回值类型 方法签名)
 * 切入点表达式
 * 1),以MyMathCalcula开始,tor_04结尾的类的任意方法
 * 	("execution(public int  com.atguigu.impl.MyMathCalcula*tor_04.*(int, int))")
 * 2), * 匹配任意参数,第一个是int,第二个是任意类型
 * 	("execution(public int  com.atguigu.impl.MyMathCalcula*tor_04.*(int, *))")
 * 3),.. 匹配任意多个参数,任意类型
 * 	("execution(public int  com.atguigu.impl.MyMathCalcula*tor_04.*(..))")
 * 4),*匹配任意一层路径
 * 	("execution(public int  com.atguigu.*.MyMathCalcula*tor_04.*(..))")
 * 5),..匹配任意多层路径
 * 	("execution(public int  com.atguigu..MyMathCalcula*tor_04.*(..))")
 * 6),权限为不能 为* 要么为public 要么不写,不写默认为public
 * 7),最模糊的的格式 ("execution(* *.*(..))"),public不写 *为任意返回值类型
 * 8),$$ || ！ ("execution(* *.*(..))||execution(* *.*(..))")
 * */
	@Test
	public void test() {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("aop04.xml");
		Calculator_04 bean = (Calculator_04) ioc.getBean("myMathCalculator_04");
		bean.add(1, 2);
		System.out.println(bean.getClass());
	}
}
