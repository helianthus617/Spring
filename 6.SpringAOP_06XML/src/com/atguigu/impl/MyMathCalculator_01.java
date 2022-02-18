package com.atguigu.impl;

import org.springframework.stereotype.Service;

import com.atguigu.inter.Calculator_01;

@Service
public class MyMathCalculator_01 implements Calculator_01 {

	@Override
	public int add(int i, int j) {
	System.out.println("内部方法执行");
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		System.out.println("内部方法执行");
		return i-j;
	} 
	

	@Override
	public int mul(int i, int j) {
		System.out.println("内部方法执行");
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		System.out.println("内部方法执行");
		return i/j;
	}

}
