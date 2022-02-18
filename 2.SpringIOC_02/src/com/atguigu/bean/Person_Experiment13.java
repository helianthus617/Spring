package com.atguigu.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person_Experiment13 {
	
	public Person_Experiment13(Pet_Experiment13 pet, Car_Experiment13 car,
			List<Book_Experiment13> books) {
		super();
		this.pet = pet;
		this.car = car;
		this.books = books;
	}
	public Pet_Experiment13 getPet() {
		return pet;
	}
	public void setPet(Pet_Experiment13 pet) {
		this.pet = pet;
	}
	private String lastName="小天  ------ private String lastName= 小天";
	private Integer age;
	private String gender;
	private String email;
	private Pet_Experiment13 pet;
	private Car_Experiment13 car;
	private List<Book_Experiment13> books;
	private Map<String,Object> maps;
	private Properties properties;
	
	public Car_Experiment13 getCar() {
		return car;
	}
	public void setCar(Car_Experiment13 car) {
		System.out.println("我是Person_Experiment13 setCar方法输出的");
		this.car = car;
	}
	public List<Book_Experiment13> getBooks() {
		return books;
	}
	public void setBooks(List<Book_Experiment13> books) {
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
		return "Person_Experiment13 [lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", email=" + email + ", pet=" + pet
				+ ", car=" + car + ", books=" + books + ", maps=" + maps
				+ ", properties=" + properties + "]";
	}
	public Person_Experiment13(Car_Experiment13 car,List<Book_Experiment13> books) {
		System.out.println("Car_Experiment13 car,List<Book_Experiment13> books 构造器输出");
		this.car = car;
		this.books = books;
	}
	public Person_Experiment13(Pet_Experiment13 pet, Car_Experiment13 car) {
		super();
		this.pet = pet;
		this.car = car;
	}
	public Person_Experiment13() {
	System.out.println("我是Person_Experiment13 无参构造器输出的");
	}
	public Person_Experiment13(String lastName, Integer age, String gender,String email) {
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		System.out.println
	("我是Person_Experiment13(String lastName, Integer age, String genderString email) 有参构造器输出的");						
	}
	public Person_Experiment13(String lastName, Integer age, String gender) {
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		System.out.println("String lastName, Integer age, String gender有参构造器输出");
	}
	public Person_Experiment13(List<Book_Experiment13> books,Car_Experiment13 car
			) {
		System.out.println("List<Book_Experiment13> books, Car_Experiment13 car构造器输出");
		this.car = car;
		this.books = books;
	}

	public Person_Experiment13(String lastName, Car_Experiment13 car,
			List<Book_Experiment13> books) {
		this.lastName = lastName;
		this.car = car;
		this.books = books;
	}
	public Person_Experiment13(String lastName, String email, String gender) {
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		System.out.println("String lastName, String email, String gender有参构造器输出");
	}

	
}
