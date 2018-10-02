package com.imti.exam.handler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.imti.exam.bean.Employee;
import com.imti.exam.service.EmployeeService;

@Controller
@RequestMapping("/UI")
public class EmployeeHandler {

	@Autowired
	private EmployeeService employeeService = null;
	
	// 获取所有的信息在页面展示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Map<String,Object> map) {
		// 获取所有的信息
		List<Employee> employees = employeeService.retrieveAllEmployees();
		map.put("employees", employees);

		return "list";
	}
	
	@RequestMapping(value="/input",method=RequestMethod.GET)
	public String input(Map<String,Object> map) {
		// 设置属性
		map.put("employee", new Employee());
		
		return "input";
	}
	
	@RequestMapping(value="/input",method=RequestMethod.POST)
	public String addEmp(Employee employee) {
		// 添加雇员信息
		employeeService.createEmployee(employee);
		
		return "redirect:/UI/list";
	}
	
	@RequestMapping(value="/delete/{empId}",method=RequestMethod.DELETE)
	public String deleteEmp(@PathVariable("empId") Integer empId) {
		// 通过ID编号删除数据
		employeeService.deleteEmployeeWithId(empId);
		
		return "redirect:/UI/list";
	}
	
	// 跳转到更新页面
	@RequestMapping(value="/edit/{empId}",method=RequestMethod.GET)
	public String edit(@PathVariable("empId") Integer empId,Map<String,Object> map) {
		Employee employee = employeeService.retrieveEmployeeWithId(empId);
		map.put("employee", employee);
		
		return "input";
	}
	
	@ModelAttribute
	public void getModel(@RequestParam(value="empId",required=false) Integer empId,
			Map<String, Object> map) {
		// 更新的时候需要准备,所以进行判断
		if(empId != null) {
			Employee employee = employeeService.retrieveEmployeeWithId(empId);
			map.put("employee", employee);
		}
	}
	
	@RequestMapping(value="/input",method=RequestMethod.PUT)
	public String update(Employee employee) {
		System.out.println("******update*****");
		
		// 更新数据
		employeeService.updateEmployeeWithModel(employee);
		
		return "redirect:/UI/list";
	}
}
