package com.atguigu.bean;

public class AirPlane_Experiment05 {
	private String fdj; //发动机
	private String yc; //机翼
	private Integer personNum; 
	private String jzName;
	private String fjsName; //副机长
	public String getFdj() {
		return fdj;
	}
	public void setFdj(String fdj) {
		this.fdj = fdj;
	}
	public String getYc() {
		return yc;
	}
	public void setYc(String yc) {
		this.yc = yc;
	}
	public Integer getPersonNum() {
		return personNum;
	}
	public void setPersonNum(Integer personNum) {
		this.personNum = personNum;
	}
	public String getJzName() {
		return jzName;
	}
	public void setJzName(String jzName) {
		this.jzName = jzName;
	}
	public String getFjsName() {
		return fjsName;
	}
	public void setFjsName(String fjsName) {
		this.fjsName = fjsName;
	}
	@Override
	public String toString() {
		return "AirPlane [fdj=" + fdj + ", yc=" + yc + ", personNum="
				+ personNum + ", jzName=" + jzName + ", fjsName=" + fjsName
				+ "]";
	}
	
}
