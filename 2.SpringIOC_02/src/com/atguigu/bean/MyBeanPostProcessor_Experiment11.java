package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor_Experiment11 
implements BeanPostProcessor{
	//beanName 是xml中配置的beanid
	//1先编写后置处理器的实现类,
	//2再将后置处理器类注册在配置文件中
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(beanName +"bean 已经调用完初始化方法了.postProcessAfterInitialization 输出的该语句");
		return bean;
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(beanName +"bean 将要调用初始化方法了.postProcessBeforeInitialization 输出的该语句");
		return bean;
	}
}
