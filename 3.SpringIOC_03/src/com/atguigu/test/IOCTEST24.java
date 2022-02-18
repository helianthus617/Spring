package com.atguigu.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.atguigu.servlet.BookServlet_Exper18;

/*
 * Spring的单元测试,使用@Autowired注解
 * 	1),导入spring-test包 spring-test-4.0.0.RELEASE
 *  2),指定配置文件的位置@ContextConfiguration(locations="classpath:ioc22.xml")
 *  3),@RunWith(SpringJUnit4ClassRunner.class) ,导入Spring的单元测试驱动
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:ioc18.xml")
public class IOCTEST24 {
	@Autowired
	BookServlet_Exper18 bookServlet_Exper18;
	@Test
	public void test() {
		bookServlet_Exper18.doGet();
	}
}
