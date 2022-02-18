package com.atguigu.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person_Experiment09 {
	
	private String lastName="小天  ------ private String lastName= 小天";
	private Integer age;
	private String gender;
	private String email;
	
	private Car_Experiment09 car;
	private List<Book_Experiment09> books;
	private Map<String,Object> maps;
	private Properties properties;
	
	public Car_Experiment09 getCar() {
		return car;
	}
	public void setCar(Car_Experiment09 car) {
		System.out.println("我是Experiment09 setCar方法输出的");
		this.car = car;
	}
	public List<Book_Experiment09> getBooks() {
		return books;
	}
	public void setBooks(List<Book_Experiment09> books) {
		this.books = books;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
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
		return "Person_Experiment09 [lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", email=" + email + ", car=" + car
				+ ", books=" + books + ", maps=" + maps + ", properties="
				+ properties + "]";
	}
	public Person_Experiment09() {
	System.out.println("我是Experiment09 无参构造器输出的");
	}
	public Person_Experiment09(String lastName, Integer age, String gender,String email) {
		super();
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		System.out.println
	("我是Experiment09(String lastName, Integer age, String genderString email) 有参构造器输出的");						
	}
	public Person_Experiment09(String lastName, Integer age, String gender) {
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		System.out.println("String lastName, Integer age, String gender有参构造器输出");
	}
	public Person_Experiment09(String lastName, String email, String gender) {
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		System.out.println("String lastName, String email, String gender有参构造器输出");
	}

	
}
