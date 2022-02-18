package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.bean.BookDao_01;

public class BookService_01 {
	@Autowired
	BookDao_01 bookDao;
	
	public void checkout(String username,String isbn){
//		减库存
		bookDao.updateStock(isbn);
		int price = bookDao.getPrice(isbn);
//		更新账户金额
		bookDao.updateBalance(username, price);
		int i =10/0;
	}
	public void updatePrice(String isbn,int price){
		bookDao.updatePrice(isbn,price);
		
	}
	//结账方法 ,该结帐方法虽然被切入点表达式给标记,但是不具有事务控制能力
	public void checkout1(String username,String isbn){
//		减库存
		bookDao.updateStock(isbn);
		int price = bookDao.getPrice(isbn);
//		更新账户金额
		bookDao.updateBalance(username, price);
		int i =10/0;
	}
	
	public void checkout2(String username,String isbn){
//		减库存
		bookDao.updateStock(isbn);
		int price = bookDao.getPrice(isbn);
//		更新账户金额
		bookDao.updateBalance(username, price);
		
	}

}
