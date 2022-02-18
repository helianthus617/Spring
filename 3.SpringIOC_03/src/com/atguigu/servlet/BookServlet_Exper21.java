package com.atguigu.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;

import com.atguigu.service.BookService_Exper18;
import com.atguigu.service.BookService_Exper19;
import com.atguigu.service.BookService_Exper20;
import com.atguigu.service.BookService_Exper21;
import com.atguigu.service.BookService_Exper22;

@Controller
public class BookServlet_Exper21 {
	
	private BookService_Exper21 bookService_Exper21;
	/*
	 * 方法上有@Autowired的话
	 * 1),这个方法会在bean被创建的时候调用
	 * 2),这个方法上的每一个参数都会自动注入合适的值
	 * */
	@Autowired
	public void method01(BookService_Exper21 bookService_Exper21){
		System.out.println("这个BookServlet_Exper21.method01方法输出的 ");
		this.bookService_Exper21=bookService_Exper21;
	}
	
	public void doGet(){
		System.out.println("是BookServlet_Exper21的doGet方法输出的");
		bookService_Exper21.save();
	}
	
}
