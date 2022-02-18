package com.atguigu.service;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class Mulservice {
		@Autowired
		BookService_01 bookService_01;	
		public void mult1_new(){
		bookService_01.checkout2("Tom","ISBN-001");
		int i=10/0;
		bookService_01.updatePrice("ISBN-002",500);			
		}		
		
		public void mult1_new1(){
			bookService_01.checkout2("Tom","ISBN-001");
			bookService_01.updatePrice("ISBN-002",500);		
			int i=10/0;
		}	
}
