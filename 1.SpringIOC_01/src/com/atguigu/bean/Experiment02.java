package com.atguigu.bean;

public class Experiment02 {
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("这个是 setLastName 方法输出的 ，该方法传入的参数为  "+lastName);
		this.lastName = lastName; 
		}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Experiment01 [lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", email=" + email + "]";
	}
	public Experiment02() {
	System.out.println("我是Experiment02 无参构造器输出的");
	}
	private String lastName;
	private Integer age;
	private String gender;
	private String email;
}
