package com.imti.exam.dao;

import java.util.List;

import com.imti.exam.bean.Employee;

public interface EmployeeDao {

	public List<Employee> retrieveAllEmployees();
	
	public Employee retrieveEmployeeWithId(Integer empId);
	
	public boolean createEmployee(Employee employee);
	
	public boolean deleteEmployeeWithId(Integer empId);
	
	public boolean updateEmployeeWithModel(Employee employee);
}
