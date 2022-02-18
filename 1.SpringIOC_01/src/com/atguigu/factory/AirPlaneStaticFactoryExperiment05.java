package com.atguigu.factory;

import com.atguigu.bean.AirPlane_Experiment05;

public class AirPlaneStaticFactoryExperiment05 {
	public static AirPlane_Experiment05 getAirPlane(String jzName){
		System.out.println("AirPlaneStaticFactory   "+jzName);
		AirPlane_Experiment05 airPlane = new AirPlane_Experiment05();
		airPlane.setFdj("太行");
		airPlane.setFjsName("jzx");
		airPlane.setJzName(jzName);
		airPlane.setPersonNum(300);
		airPlane.setYc("198.00");
		return airPlane;
	}
}
