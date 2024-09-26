package com.dvd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dvd.dao.EmployeeDao;
import com.dvd.model.Employee;

@Controller
public class EmployeeController 
{
	@Autowired
	@Qualifier("emp1")
	private EmployeeDao employeedao;
	
	
      @RequestMapping("/hello1")
      public String helloJsp1()
      {
    	  return "hello";
      }
	
      
      @RequestMapping("/hello2")
      public String helloJsp2()
      {
    	  return "hello";
      }
	
      
      @RequestMapping("/getAllEmployee")
      public String getAllEmployee(Model model)
      {
    	  List<Employee> emp = employeedao.getAllEmployee();
    	  model.addAttribute("emp",emp);
    	  return "getAllEmployee";
      }
      
      
}




















