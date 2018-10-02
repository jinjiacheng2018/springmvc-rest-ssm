package com.imti.exam.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imti.exam.bean.Employee;
import com.imti.exam.dao.EmployeeDao;

public class SSMTest {

	private ApplicationContext ctx = null;
	private EmployeeDao employeeDao = null;
	
	{
		String configLocation = "spring/applicationContext.xml";
		ctx = new ClassPathXmlApplicationContext(configLocation);
		employeeDao = ctx.getBean(EmployeeDao.class);
	}
	
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}

	@Test
	public void testRetrieve() {
		Employee employee = employeeDao.retrieveEmployeeWithId(1);
		System.out.println(employee);
	}
}
