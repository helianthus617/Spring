package com.atguigu.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.atguigu.service.BookService_Exper18;
import com.atguigu.service.BookService_Exper19;
import com.atguigu.service.BookService_Exper20;

@Controller
public class BookServlet_Exper20 {
	@Qualifier("bookServiceExt_Exper20")
	@Autowired
	private BookService_Exper20 bookService_Exper201;
	
	public void doGet(){
		System.out.println("是bookServiceExt_Exper20的doGet方法输出的");
		bookService_Exper201.save();
	}
}
