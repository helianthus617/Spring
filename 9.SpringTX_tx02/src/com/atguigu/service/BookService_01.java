package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.bean.BookDao_01;
@Service
public class BookService_01 {
	@Autowired
	BookDao_01 bookDao;
//	属性:
//	1.timeout=3 超时时间,超过三秒则自动回滚操作
//	2.readOnly=true 如果对数据库的操作是只读的,设置为true内部优化使用,如果检测到增删改操作则抛出异常
//	知识点:
//		1),运行时异常发生后默认都会回滚,编译时异常默认不会滚
//		2),noRollbackFor,让运行时异常不会回滚(运行时异常)
//		noRollbackForClassName={"java.lang.ArithmeticException"}/
//		noRollbackFor={ArithmeticException.class}
//		3),rollbackFor,让编译期异常回滚
//      4),数据库并发问题
	/*	
	 * 假如两个事务并发执行 T1和T2
		①脏读:
			1,T1修改年龄从10改为20
			2,T2读取了年龄20
			3,T1回滚年龄恢复为10
			4,T2读到的数据20就是无效的
		②不可重复读:
			1,T1读取了AGE的值为20
			2,T2修改为30
			3,T1再次读取值为30,两次读取不一致
		③幻读:
			1,T1读取了表student的一部分数据
			2,T2向表中插入了新的行
			3,T1再次读取了表student,多出了一些行
		隔离级别:
			①读未提交:允许T1读取T2未提交的修改
			②读已提交:要求T1只读取T2提交的修改
			③可重复读:T1可以多次从一个字段中读取相同的值,即T1在执行期间禁止其他事务对这个字段进行更新
			④串行化:确保T1在执行期间,禁止其他事务对这个表进行增删改操作
	===================================================
				脏读		不可重复读	幻读
	读未提交		有		有			有
	读已提交		无		有			有
	可重复读		无		无			有
	串行化		无		无			无
	====================================================
				Oracle	mysql
	读未提交		×		√			
	读已提交		√		√			
	可重复读		×		√(默认)
	串行化		√		√	
	知识点1:模拟事务操作,只需要修改读的那个事务隔离级别,写的不修改,会话是一开一关命令行窗口		
	知识点2:并发写操作,T1的修改不提交,T2就会等待T1提交完成之后再执行.
	知识点3:mysql8默认的隔离级别是 SELECT @@transaction_isolation---> REPEATABLE-READ	
	知识点4:容器里保存的组件(有事务的组件)的代理对象 com.atguigu.service.BookService_01$$EnhancerByCGLIB$$518ced2e	
	*/
	//结账方法
	@Transactional(isolation=Isolation.DEFAULT)
	public void checkout(String username,String isbn){
//		减库存
		bookDao.updateStock(isbn);
		int  i=10/0;
		int price = bookDao.getPrice(isbn);
//		更新账户金额
		bookDao.updateBalance(username, price);
	}
}
