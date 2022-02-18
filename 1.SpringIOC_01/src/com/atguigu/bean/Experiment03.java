package com.atguigu.bean;

public class Experiment03 {
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
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
	public Experiment03() {
	System.out.println("我是Experiment03 无参构造器输出的");
	}
	public Experiment03(String lastName, Integer age, String gender,String email) {
		super();
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		System.out.println
	("我是Experiment03(String lastName, Integer age, String genderString email) 有参构造器输出的");						
	}
	public Experiment03(String lastName, Integer age, String gender) {
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		System.out.println("String lastName, Integer age, String gender有参构造器输出");
	}
	public Experiment03(String lastName, String email, String gender) {
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		System.out.println("String lastName, String email, String gender有参构造器输出");
	}
	private String lastName;
	private Integer age;
	private String gender;
	private String email;
}
