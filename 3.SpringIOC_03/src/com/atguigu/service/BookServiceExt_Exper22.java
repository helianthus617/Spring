package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.dao.BookDao_Exper18;
import com.atguigu.dao.BookDao_Exper19;
import com.atguigu.dao.BookDao_Exper20;
import com.atguigu.dao.BookDao_Exper22;

@Service
public class BookServiceExt_Exper22 extends BookService_Exper22 {
	@Autowired
	private BookDao_Exper22 bookDao_Exper22;
	public void save(){		
		System.out.println("这是BookServiceExt_Exper22 的save 方法 输出,该方法调用Dao帮你保存图书");
		bookDao_Exper22.save();
	}
}
