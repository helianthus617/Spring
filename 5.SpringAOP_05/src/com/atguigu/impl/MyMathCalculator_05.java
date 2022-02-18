package com.atguigu.impl;

import org.springframework.stereotype.Service;

import com.atguigu.inter.Calculator_01;
import com.atguigu.inter.Calculator_02;
import com.atguigu.inter.Calculator_04;
import com.atguigu.inter.Calculator_05;
@Service
public class MyMathCalculator_05 implements Calculator_05 {

	@Override
	public int add(int i, int j) {
	
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		
		return i-j;
	}
	

	@Override
	public int mul(int i, int j) {
	
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		
		return i/j;
	}

}
