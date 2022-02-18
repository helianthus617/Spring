package com.atguigu.factory;

import java.util.UUID;

import org.springframework.beans.factory.FactoryBean;

import com.atguigu.bean.Book_Experiment04;
import com.atguigu.bean.Book_Experiment05;
//实现FactoryBean接口的类是Spring可以认识的工厂类,spring会自动调用工厂方法创建实例
/*
 * 1,编写一个FactoryBean的实现类
 * 2,在spring配置文件中进行注册
 * */
public class MyFactoryBeanImpleExperiment05 implements FactoryBean<Book_Experiment05>{

	//工厂方法,返回创建的对象
	@Override
	public Book_Experiment05 getObject() throws Exception {
		Book_Experiment05 book =new Book_Experiment05();
		book.setBookName(UUID.randomUUID().toString());
		return book;
	}
	//Spring 会自动创建这个方法来确认创建的对象是什么类型
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Book_Experiment05.class;
	}

	@Override
	public boolean isSingleton() {
		//控制是否是单例
		//false 不是单例
		return true;
	}
	

}
