package com.atguigu.impl;

import org.springframework.stereotype.Service;

import com.atguigu.inter.Calculator_01;
import com.atguigu.inter.Calculator_02;
@Service
public class MyMathCalculator_03  {

	
	public int add(int i, int j) {
	
		return i+j;
	}


	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}


	public int mul(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}


	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

}
