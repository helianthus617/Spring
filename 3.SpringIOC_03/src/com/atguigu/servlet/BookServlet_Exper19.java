package com.atguigu.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.service.BookService_Exper18;
import com.atguigu.service.BookService_Exper19;

@Controller
public class BookServlet_Exper19 {

	@Autowired
	private BookService_Exper19 bookServiceExt_Exper19;
	
	public void doGet(){
		System.out.println("是BookServlet_Exper19的doGet方法输出的");
		bookServiceExt_Exper19.save();
	}
}
