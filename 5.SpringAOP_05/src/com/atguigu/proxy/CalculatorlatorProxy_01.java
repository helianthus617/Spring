package com.atguigu.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.atguigu.inter.Calculator_01;
public class CalculatorlatorProxy_01 {

	public static Calculator_01 getProxy(final Calculator_01 calculator) {
	ClassLoader loader=calculator.getClass().getClassLoader();
	Class<?>[] interfaces=calculator.getClass().getInterfaces();
	InvocationHandler h=new InvocationHandler() {
		@Override
		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {
			System.out.println("记录日志开始");
			Object re = method.invoke(calculator, args);
			System.out.println("记录日志结束");
			return re;
		}
	};
	Object proxy1= Proxy.newProxyInstance(loader, interfaces, h);
	return (Calculator_01)proxy1;
		
	}
}
