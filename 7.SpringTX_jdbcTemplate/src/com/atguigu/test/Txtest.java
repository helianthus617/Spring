package com.atguigu.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.atguigu.bean.Employee;
public class Txtest {
// 	jdbctemplate所需jar包
//	spring-tx-4.0.0.RELEASE.jar
//	spring-orm-4.0.0.RELEASE.jar
//	spring-jdbc-4.0.0.RELEASE.jar
	ApplicationContext ioc =new ClassPathXmlApplicationContext("ApplicationContext.xml");
	//实验1：测试数据源,mysql-connector-java-5.1.46,该驱动支持mysql8/mysql5
	@Test 
	public void test1() throws Exception {
	DataSource bean = (DataSource) ioc.getBean("comboPooledDataSource");
	Connection connection = bean.getConnection();
	System.out.println("connection-->"+connection);
	connection.close();
	}
	JdbcTemplate jdbcTemplate = (JdbcTemplate) ioc.getBean("jdbcTemplate");
	//实验2：将emp_id=5的记录的salary字段更新为1300.00
	@Test
	public void test2() throws Exception {
	String sql="UPDATE employee SET salary=? WHERE emp_id=? ";
	jdbcTemplate.update(sql,1300,5);
	}
	//实验3：批量插入
	@Test
	public void test3() throws Exception {
	String sql="INSERT INTO  employee(emp_name,salary) VALUES(?,?)";
	ArrayList<Object[]> batchArgs = new ArrayList<Object[]>();
	batchArgs.add(new Object[]{"a","998"});
	batchArgs.add(new Object[]{"v","998"});
	batchArgs.add(new Object[]{"c","998"});
	batchArgs.add(new Object[]{"e","998"});
	jdbcTemplate.batchUpdate(sql,batchArgs);
	}
	//实验4：查询emp_id=5的数据库记录，封装为一个Java对象返回
	@Test
	public void test4() throws Exception {
	String sql="SELECT emp_id empId,emp_name empName,salary FROM employee WHERE emp_id=?";
	Employee queryForObject = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class),5);
	System.out.println(queryForObject);
	}
	//实验5：查询salary>4000的数据库记录，封装为List集合返回
	@Test
	public void test5() throws Exception {
	String sql="SELECT emp_id empId,emp_name empName,salary FROM employee WHERE salary > ?";
	 List<Employee> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class),4000);
	System.out.println(query);
	}
	//实验6：查询最大salary	
	@Test
	public void test6() throws Exception {
	String sql="SELECT MAX(salary) FROM employee";
		Double queryForObject = jdbcTemplate.queryForObject(sql,Double.class);
		System.out.println(queryForObject);
	}
	NamedParameterJdbcTemplate namedParameterJdbcTemplate = (NamedParameterJdbcTemplate) ioc.getBean("namedParameterJdbcTemplate");
	
	//实验7：使用带有具名参数的SQL语句插入一条员工记录，并以Map形式传入参数值
	@Test
	public void test7() throws Exception {
	String sql="INSERT INTO  employee(emp_name,salary) VALUES(:arg1,:arg2)";
	Map<String, Object> paramMap =new HashMap<>();
	paramMap.put("arg1","xx" );
	paramMap.put("arg2",9999 );
	namedParameterJdbcTemplate.update(sql, paramMap);
	}
	//实验8：重复实验7，以SqlParameterSource形式传入参数值
	@Test
	public void test8() throws Exception {
		String sql="INSERT INTO  employee(emp_name,salary) VALUES(:empName,:salary)";
		Employee employee =new Employee("test",111);
		namedParameterJdbcTemplate.update(sql, new BeanPropertySqlParameterSource(employee));
	}
	//实验9：创建BookDao，自动装配JdbcTemplate对象
	@Test
	public void test9() throws Exception {
	String sql="SELECT MAX(salary) FROM employee";
		Double queryForObject = jdbcTemplate.queryForObject(sql,Double.class);
		System.out.println(queryForObject);
	}
	

	






}
