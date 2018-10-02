package com.imti.exam.service;

import java.util.List;

import com.imti.exam.bean.Employee;

public interface EmployeeService {

	public List<Employee> retrieveAllEmployees();

	public Employee retrieveEmployeeWithId(Integer empId);

	public boolean createEmployee(Employee employee);

	public boolean deleteEmployeeWithId(Integer empId);

	public boolean updateEmployeeWithModel(Employee employee);
}
