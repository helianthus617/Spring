package com.atguigu.bean;

public class Car_Experiment13 {
private String carName;
private Integer price;
private String color;
public Car_Experiment13() {
	System.out.println("Car_Experiment13 无参构造器输出");
}
public String getCarName() {
	return carName;
}
@Override
public String toString() {
	return "Car [carName=" + carName + ", price=" + price + ", color=" + color
			+ "]";
}

public void setCarName(String carName) {
	this.carName = carName;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
}
