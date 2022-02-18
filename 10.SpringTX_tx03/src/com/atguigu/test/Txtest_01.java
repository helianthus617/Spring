package com.atguigu.test;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Propagation;

import com.atguigu.service.BookService_01;
import com.atguigu.service.Mulservice;
/*
 * 事务的传播行为:如果有多个事务进行嵌套运行,子事务是否与大事务共用一个方法.
 * 传播属性:
 * 	required 如果有事务在运行,当前的方法就在这个事务内运行,否则启动一个新事务,并放在自己的事务内运行.
 * 	required_new 当前方法必须启动新事务,并在它自己的事务内运行,如果有事务正在运行,应该将他挂起.
	propagation=Propagation.REQUIRED为默认传播行为.
	
	multx(){
		//REQUIRED
		A(){
			//REQUIRED_NEW
			B(){}
			//REQUIRED
			C(){}
			}					
		//REQUIRED_NEW
		D(){			
			//REQUIRED
			E(){
					//REQUIRED_NEW
					F(){						
					}
				}
			//REQUIRED_NEW
			G(){						
			}				
			}
		10/0  B成功 D整个分支都成功
		}
=======================================
	multx(){
		//REQUIRED
		A(){
			//REQUIRED_NEW
			B(){}
			//REQUIRED
			C(){}
			}					
		//REQUIRED_NEW
		D(){
					////代码1
			//REQUIRED
			E(){
					//REQUIRED_NEW
					F(){		
					10/0  不try-catch
					}
				}
			//REQUIRED_NEW
			G(){						
			}				
			}
		}
	E,F,G,A,C,崩.代码1也会滚 ,只有B(){}正常执行
	知识点1: 已经执行的request_都会成功
	知识点2: 如果是Propagation=required 事务的属性都继承于大事务
	知识点3. Propagation=required:将之前事务使用的connection的连接传递给这个方法使用
	 		propagation=Propagation.REQUIRES_NEW: 这个方法直接使用新的connection
	 知识点4.//本类事务方法之间调用就只是一个事务
 */
public class Txtest_01 {
	ApplicationContext ioc =
			new ClassPathXmlApplicationContext("ApplicationContext_01.xml");
	@Test
	public void test() {
		Mulservice bean = ioc.getBean(Mulservice.class);
		bean.mult();
	}
	@Test
	public void test_new() {
		Mulservice bean = ioc.getBean(Mulservice.class);
		bean.mult1_new();
	}
	@Test
	public void test_mix() {
		Mulservice bean = ioc.getBean(Mulservice.class);
		bean.mult1_mix();
	}
	//本类事务方法之间调用就只是一个事务
	@Test
	public void test_inner_mix() {
		BookService_01 bean = ioc.getBean(BookService_01.class);
		bean.multx();
	}
	
}
