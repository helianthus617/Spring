package com.atguigu.utils;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogUtils02 {
	//execution(访问修饰符 返回值类型 方法签名)
	@Before("execution(public int  com.atguigu.impl.MyMathCalculator_02.*(int, int))")
	public static void logStart(){
		System.out.println("方法准备执行");
	}
	@AfterReturning("execution(public int  com.atguigu.impl.MyMathCalculator_02.*(int, int))")
	public static void logReturn(){
		System.out.println("方法正常返回");
	}
	@AfterThrowing("execution(public int  com.atguigu.impl.MyMathCalculator_02.*(int, int))")
	public static void logException(){
		System.out.println("方法有异常");
	}
	@After("execution(public int  com.atguigu.impl.MyMathCalculator_02.*(int, int))")
	public static void logEnd(){
		System.out.println("方法结束");
	}
}
