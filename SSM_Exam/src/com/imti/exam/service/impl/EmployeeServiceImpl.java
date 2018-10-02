package com.imti.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imti.exam.bean.Employee;
import com.imti.exam.dao.EmployeeDao;
import com.imti.exam.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao = null;
	
	@Override
	public List<Employee> retrieveAllEmployees() {
		return employeeDao.retrieveAllEmployees();
	}

	@Override
	public Employee retrieveEmployeeWithId(Integer empId) {
		return employeeDao.retrieveEmployeeWithId(empId);
	}

	@Override
	public boolean createEmployee(Employee employee) {
		return employeeDao.createEmployee(employee);
	}

	@Override
	public boolean deleteEmployeeWithId(Integer empId) {
		return employeeDao.deleteEmployeeWithId(empId);
	}

	@Override
	public boolean updateEmployeeWithModel(Employee employee) {
		return employeeDao.updateEmployeeWithModel(employee);
	}
}
