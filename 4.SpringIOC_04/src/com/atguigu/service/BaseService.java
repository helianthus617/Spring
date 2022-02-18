package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.dao.BaseDao;
import com.atguigu.dao.BookDao;

public class BaseService<T> {
	@Autowired
	BaseDao<T> baseDao;
	public void save(){
		baseDao.save();
	}
}
