package com.atguigu.bean;

public class Book_Experiment10 {
private String bookName;
private String author;
public void myInit(){
	System.out.println("这是Book_Experiment10类定义的myInit()方法输出的");
}
public void myDestory(){
	System.out.println("这是Book_Experiment10类定义的myDestory()方法输出的");
}

public String getBookName() {
	return bookName;
}
public Book_Experiment10() {
	super();
	System.out.println("Book_Experiment10无参构造器输出");
}
public void setBookName(String bookName) {
	System.out.println("setBookName 方法输出的	"+bookName);
	this.bookName = bookName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book [bookName=" + bookName + ", author=" + author + "]";
}

}
