package com.atguigu.bean;
public class Pet_Experiment13 {
@Override
	public String toString() {
		return "Pet_Experiment13 [petName=" + petName + ", price=" + price
				+ "]";
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		System.out.println("setPetName 输出"+petName);
		this.petName = petName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Pet_Experiment13(String petName, Integer price) {
		System.out.println("Pet_Experiment13 String petName, Integer price 有参构造器输出");
		this.petName = petName;
		this.price = price;
	}
	public Pet_Experiment13() {
		System.out.println("Pet_Experiment13无参构造器输出");
		
	}
private String petName;
private Integer price;
}
