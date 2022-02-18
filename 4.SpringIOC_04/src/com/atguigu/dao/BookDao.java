package com.atguigu.dao;

import org.springframework.stereotype.Repository;

import com.atguigu.bean.Book;
@Repository
public class BookDao extends BaseDao<Book> {

	@Override
	public void save() {
	System.out.println("BookDao.save 保存图书");
	}

}
