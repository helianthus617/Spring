package com.atguigu.utils;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/*
 * 拿到执行方法的详细信息
 * 	1),只需要为通知方法的参数列表上写一个参数  JoinPoint,该参数封装了当前目标方法的信息
 * 使用throwing,和returning 属性,显示指定该值即可
 * 	@AfterReturning(value="execution(public int  com.atguigu.impl.MyMathCalcu*tor_05.*(int,*))",returning="arg1")
 * 注意:logReturn(Object arg1) / logException(Exception e),如果指定异常类型和返回值的类型,
 * 如果抛出的异常与指定的异常不相同的话,该异常通知方法不会被调用,返回值类型也同理
 *  2),抽取可重用的切入点表达式,随便声明一个没有实现返回值是void 的方法
 * */
@Aspect
@Component
public class LogUtils05 {
//	抽取可重用的切入点表达式
	@Pointcut("execution(public int  com.atguigu.impl.MyMathCalcu*tor_05.*(int, *))")
	public void method01(){	
	}
//	使用可重用的切入点表达式
	@Before("method01()")
	public static void logStart(JoinPoint joinPoint){
		Object[] args = joinPoint.getArgs();
		String name = joinPoint.getSignature().getName();
		System.out.println(name+"方法准备执行参数为"+Arrays.asList(args));
	}
	@AfterReturning(value="execution(public int  com.atguigu.impl.MyMathCalcu*tor_05.*(int,*))",returning="arg1")
	public static void logReturn(Object arg1){
		System.out.println("方法正常返回,计算的结果是"+arg1);
	}
	@AfterThrowing(value="execution(public int  com.atguigu.impl.MyMathCalcu*tor_05.*(int,*))",throwing="e")
	public static void logException(Exception e){
		System.out.println("方法有异常,异常是"+e);
	}
	@After("execution(public int  com.atguigu.impl.MyMathCalcu*tor_05.*(int, *))")
	public static void logEnd(){
		System.out.println("方法结束");
	}
}
