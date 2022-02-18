package com.atguigu.bean;

public class Book_Experiment06 {
private String bookName;
private String author;
public String getBookName() {
	return bookName;
}
public Book_Experiment06() {
	super();
	System.out.println("Book_Experiment06无参构造器输出");
}
public void setBookName(String bookName) {
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
