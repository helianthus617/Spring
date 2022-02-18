package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.bean.Car_Experiment04;
import com.atguigu.bean.Experiment01;
import com.atguigu.bean.Person_Experiment04;
import com.atguigu.bean.Person_Experiment06;
import com.atguigu.bean.Person_Experiment07;

public class Experiment08Test {
	/*
	实验8：bean之间的依赖
	 * */
	@Test
	public void test1() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("experiment08.xml");
		}	
	}

	
