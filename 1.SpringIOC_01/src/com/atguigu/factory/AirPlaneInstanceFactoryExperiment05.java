package com.atguigu.factory;

import com.atguigu.bean.AirPlane_Experiment05;

//实例工厂
public class AirPlaneInstanceFactoryExperiment05 {

	public  AirPlane_Experiment05 getAirPlane(String jzName){
		System.out.println("  AirPlaneInstanceFactory" +jzName);
		AirPlane_Experiment05 airPlane = new AirPlane_Experiment05();
		airPlane.setFdj("太行");
		airPlane.setFjsName("jzx");
		airPlane.setJzName(jzName);
		airPlane.setPersonNum(300);
		airPlane.setYc("198.00");
		return airPlane;
	}
}
