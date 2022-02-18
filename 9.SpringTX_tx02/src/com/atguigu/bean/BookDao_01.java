package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class BookDao_01 {
	
		@Autowired
		JdbcTemplate jdbcTemplate;
	//减余额
		public void updateBalance(String username,int price)
		{
			String sql="UPDATE account SET balance =balance -? where username =?";
			jdbcTemplate.update(sql,price,username);			
		}
	//获取某本书的价格
		public int getPrice(String isbn)
		{
			String sql="SELECT price FROM book WHERE isbn=?";
			return jdbcTemplate.queryForObject(sql, Integer.class,isbn);
		}
	//减去库存
		public int updateStock(String isbn)
		{
			String sql="UPDATE book_stock SET stock=stock-1 WHERE isbn=?";
			return jdbcTemplate.update(sql,isbn);
		}
}
