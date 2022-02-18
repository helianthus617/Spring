package com.atguigu.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;

import com.atguigu.service.BookService_Exper18;
import com.atguigu.service.BookService_Exper19;
import com.atguigu.service.BookService_Exper20;
import com.atguigu.service.BookService_Exper22;
/*

 * */
@Controller
public class BookServlet_Exper22 {
	@Qualifier("bookServiceExt_Exper2211")
	@Autowired(required=false)
	private BookService_Exper22 bookServiceExt_Exper221;
	
	public void doGet(){
		System.out.println("是BookServlet_Exper22的doGet方法输出的");
		bookServiceExt_Exper221.save();
	}
}
