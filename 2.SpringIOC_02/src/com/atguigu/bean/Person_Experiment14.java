package com.atguigu.bean;

import java.util.List;
import java.util.Map;


public class Person_Experiment14 {
	
	@Override
	public String toString() {
		return "Person_Experiment14 [salary=" + salary + ", lastName="
				+ lastName + ", age=" + age + ", gender=" + gender + ", email="
				+ email + ", car=" + car + ", books=" + books + ", maps="
				+ maps + "]";
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
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
	public Car_Experiment14 getCar() {
		return car;
	}
	public void setCar(Car_Experiment14 car) {
		this.car = car;
	}
	public List<Book_Experiment14> getBooks() {
		return books;
	}
	public void setBooks(List<Book_Experiment14> books) {
		this.books = books;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	private Double salary;
	private String lastName="小天  ------ private String lastName= 小天";
	private Integer age;
	private String gender;
	private String email;
	private Car_Experiment14 car;
	private List<Book_Experiment14> books;
	private Map<String,Object> maps;

	
	

	
}
