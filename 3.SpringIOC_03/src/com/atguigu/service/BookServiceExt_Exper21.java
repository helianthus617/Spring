package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.dao.BookDao_Exper18;
import com.atguigu.dao.BookDao_Exper19;
import com.atguigu.dao.BookDao_Exper20;
import com.atguigu.dao.BookDao_Exper21;
import com.atguigu.dao.BookDao_Exper22;

@Service
public class BookServiceExt_Exper21 extends BookService_Exper21 {
	@Autowired
	private BookDao_Exper21 bookDao_Exper21;
	public void save(){		
		System.out.println("这是BookServiceExt_Exper21 的save 方法 输出,该方法调用Dao帮你保存图书");
		bookDao_Exper21.save();
	}
}
