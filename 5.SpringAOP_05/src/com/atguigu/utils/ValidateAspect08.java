package com.atguigu.utils;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/*
多切面通知方法执行的顺序 */
@Aspect
@Component
public class ValidateAspect08 {
//	抽取可重用的切入点表达式
	@Pointcut("execution(public int  com.atguigu.impl.MyMathCalcu*tor_07.*(int, *))")
	public void method011(){	
	}
//	使用可重用的切入点表达式
	@Before("method011()")
	public static void logStart(JoinPoint joinPoint){
		Object[] args = joinPoint.getArgs();
		String name = joinPoint.getSignature().getName();
		System.out.println("ValidateAspect方法输出" +name+"方法准备执行参数为"+Arrays.asList(args));
	}
	@AfterReturning(value="execution(public int  com.atguigu.impl.MyMathCalcu*tor_07.*(int,*))",returning="arg1")
	public static void logReturn(Object arg1){
		System.out.println("ValidateAspect方法输出" +"方法正常返回,计算的结果是"+arg1);
	}
	@AfterThrowing(value="execution(public int  com.atguigu.impl.MyMathCalcu*tor_07.*(int,*))",throwing="e")
	public static void logException(Exception e){
		System.out.println("ValidateAspect方法输出" +"方法有异常,异常是"+e);
	}
	@After("execution(public int  com.atguigu.impl.MyMathCalcu*tor_07.*(int, *))")
	public static void logEnd(){
		System.out.println("ValidateAspect方法输出" +"方法结束");
	}
}
