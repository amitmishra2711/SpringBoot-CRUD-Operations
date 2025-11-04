package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmpController {
	@Autowired
	private EmployeeService emp;
	
	@GetMapping("/getAll")
	public List<Employee> getAll()
	{
		return emp.getEmployee();
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee e)
	{
		return emp.addEmployee(e);

	}
}
