package com.atguigu.utils;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/*
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
@Aspect
@Component
public class LogUtils04 {
	//execution(访问修饰符 返回值类型 方法签名)
	@Before("execution(public int  com.atguigu.impl.MyMathCalcu*tor_04.*(int, *))")
	public static void logStart(){
		System.out.println("方法准备执行");
	}
	@AfterReturning("execution(public int  com.atguigu.impl.MyMathCalcu*tor_04.*(int,*))")
	public static void logReturn(){
		System.out.println("方法正常返回");
	}
	@AfterThrowing("execution(public int  com.atguigu.impl.MyMathCalcu*tor_04.*(int,*))")
	public static void logException(){
		System.out.println("方法有异常");
	}
	@After("execution(public int  com.atguigu.impl.MyMathCalcu*tor_04.*(int, *))")
	public static void logEnd(){
		System.out.println("方法结束");
	}
}
