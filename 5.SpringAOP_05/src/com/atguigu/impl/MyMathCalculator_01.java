package com.atguigu.impl;

import com.atguigu.inter.Calculator_01;

public class MyMathCalculator_01 implements Calculator_01 {

	@Override
	public int add(int i, int j) {
	
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	@Override
	public int mul(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

}
