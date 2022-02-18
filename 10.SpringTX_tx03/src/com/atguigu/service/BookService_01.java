package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.bean.BookDao_01;
@Service
public class BookService_01 {
	@Autowired
	BookDao_01 bookDao;
	
	//本类事务方法之间调用就只是一个事务,结果相当于都是REQUIRES
	@Transactional
	public void multx(){
		//REQUIRES_NEW
		updatePrice2("ISBN-002",500);
		//REQUIRES
		checkout2("Tom","ISBN-001");
		int i=10/0;
	}
	
	//结账方法
	@Transactional(propagation=Propagation.REQUIRED)
	public void checkout(String username,String isbn){
//		减库存
		bookDao.updateStock(isbn);
		int price = bookDao.getPrice(isbn);
//		更新账户金额
		bookDao.updateBalance(username, price);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public void updatePrice(String isbn,int price){
		bookDao.updatePrice(isbn,price);
		
	}
	
	
	//结账方法
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void checkout1(String username,String isbn){
//		减库存
		bookDao.updateStock(isbn);
		int price = bookDao.getPrice(isbn);
//		更新账户金额
		bookDao.updateBalance(username, price);
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void updatePrice1(String isbn,int price){
		bookDao.updatePrice(isbn,price);
		
	}
	
	//结账方法
	@Transactional(propagation=Propagation.REQUIRED)
	public void checkout2(String username,String isbn){
//		减库存
		bookDao.updateStock(isbn);
		int price = bookDao.getPrice(isbn);
//		更新账户金额
		bookDao.updateBalance(username, price);
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void updatePrice2(String isbn,int price){
		bookDao.updatePrice(isbn,price);
		
	}
}
