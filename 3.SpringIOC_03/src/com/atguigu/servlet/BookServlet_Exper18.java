package com.atguigu.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.service.BookService_Exper18;

@Controller
public class BookServlet_Exper18 {

	@Autowired
	private BookService_Exper18 bookService_Exper18;
	
	public void doGet(){
		System.out.println("是BookService_Exper18的doGet方法输出的");
		bookService_Exper18.save();
	}
}
