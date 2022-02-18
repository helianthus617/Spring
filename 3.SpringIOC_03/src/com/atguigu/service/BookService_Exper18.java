package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.dao.BookDao_Exper18;

@Service
public class BookService_Exper18 {
	@Autowired
	private BookDao_Exper18 bookDao_Exper18;
	public void save(){		
		System.out.println("这是BookService_Exper18 的save 方法 输出,该方法调用Dao帮你保存图书");
		BookDao_Exper18.save();
	}
}
