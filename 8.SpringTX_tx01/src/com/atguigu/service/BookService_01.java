package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.bean.BookDao_01;
@Service
public class BookService_01 {
	@Autowired
	BookDao_01 bookDao;
	//结账方法	
	@Transactional
	public void checkout(String username,String isbn){
//		减库存
		bookDao.updateStock(isbn);
		int  i=10/0;
		int price = bookDao.getPrice(isbn);
//		更新账户金额
		bookDao.updateBalance(username, price);
	}
}
