package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.dao.BookDao_Exper18;
import com.atguigu.dao.BookDao_Exper19;

@Service
public class BookService_Exper19 {
	@Autowired
	private BookDao_Exper19 bookDao_Exper19;
	public void save(){		
		System.out.println("这是BookService_Exper19 的save 方法 输出,该方法调用Dao帮你保存图书");
		bookDao_Exper19.save();
	}
}
