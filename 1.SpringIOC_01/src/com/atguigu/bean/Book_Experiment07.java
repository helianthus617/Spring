package com.atguigu.bean;

public class Book_Experiment07 {
private String bookName;
private String author;
public String getBookName() {
	return bookName;
}
public Book_Experiment07() {
	super();
	System.out.println("Book_Experiment07无参构造器输出");
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
