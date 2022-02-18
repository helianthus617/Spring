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
环绕通知 --->ProceedingJoinPoint(环绕通知执行顺序是正常的)
 */
@Aspect
@Component
public class LogUtils06 {
//	抽取可重用的切入点表达式
	@Pointcut("execution(public int  com.atguigu.impl.MyMathCalcu*tor_06.*(int, *))")
	public void method01(){	
	}
//	使用可重用的切入点表达式
	@Around("method01()")
	public  Object myAround(ProceedingJoinPoint pjp){
		Object[] args = pjp.getArgs();
		String name = pjp.getSignature().getName();
		Object proceed=null;
		try {
		System.out.println(name+ "环绕前置通知 方法执行开始");
		proceed = pjp.proceed(args);
		System.out.println(name+"环绕返回通知 方法的返回值是"+proceed);
		return proceed;
		} catch (Throwable e) {
		System.out.println(name+"环绕异常通知 方法执行出现异常");
		}finally{
		System.out.println(name+"环绕后置通知 方法执行结束");
		}
		return  proceed;
	}
}
