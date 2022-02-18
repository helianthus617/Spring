package com.atguigu.impl;

import org.springframework.stereotype.Service;

import com.atguigu.inter.Calculator_01;
import com.atguigu.inter.Calculator_02;
import com.atguigu.inter.Calculator_04;
import com.atguigu.inter.Calculator_05;
import com.atguigu.inter.Calculator_06;
import com.atguigu.inter.Calculator_07;
@Service
public class MyMathCalculator_07 implements Calculator_07 {

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
