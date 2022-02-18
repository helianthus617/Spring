package com.atguigu.dao;

import org.springframework.stereotype.Repository;

import com.atguigu.bean.Book;
import com.atguigu.bean.User;
@Repository
public class UserDao  extends BaseDao<User> {

	@Override
	public void save() {
	System.out.println("UserDao .save 保存用户");
		
	}

}
