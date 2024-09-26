package com.dvd.operations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvd.operations.entity.Employee;
import com.dvd.operations.model.EmployeeVo;
import com.dvd.operations.service.EmployeeService;


@RestController
@RequestMapping("/")
public class EmployeeController
{
	
  @Autowired
  private EmployeeService employeeService;
               
  @PostMapping
  public Employee saveEmployee(@RequestBody EmployeeVo employeeVo)
  {
	  return employeeService.saveEmployee(employeeVo);
  }
  
  @GetMapping()
  public List<Employee> getEmployee()
	{
		List<Employee> all = employeeService.getEmployees();
		return all;
	}
  
  @GetMapping("/employee/{empId}")
  public Employee getEmployee(@PathVariable("empId") Integer empolyeeId)
	{
		return employeeService.getEmployee(empolyeeId);
	}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}













