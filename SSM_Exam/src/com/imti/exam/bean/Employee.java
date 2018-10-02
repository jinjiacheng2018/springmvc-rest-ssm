package com.imti.exam.bean;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private Integer empId = 0;
	private String empName = "";
	private Integer empAge = 0;
	private String empEmail = "";
	private String empGender = "";

	public Employee() {
		super();
	}

	public Employee(String empName, Integer empAge, String empEmail, String empGender) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empEmail = empEmail;
		this.empGender = empGender;
	}

	public Employee(Integer empId, String empName, Integer empAge, String empEamil, String empGender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empEmail = empEamil;
		this.empGender = empGender;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empEamil=" + empEmail
				+ ", empGender=" + empGender + "]";
	}
}
