package com.dvd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvd.entity.Department;
import com.dvd.service.DepartmentService;

@RestController
public class DepartmentController
{
    
	@Autowired
	private DepartmentService departmentService;
	
	   @GetMapping(value={"/hello","/"})
	   public String Hello()
	   {
		   return "hello rest api";
	   }
	
   @GetMapping("/getDepartment")
   public Department getDepartment()
   {
	   return new Department(120l,"smith","usa");
   }
   
   
   @GetMapping("/getAllDepartment")
   public List<Department> getAllDepartment()
   {
	   return departmentService.getAllDepartments();
   }
   
   @GetMapping("/isDepartment")
   public boolean isDepartment()
   {
	   if (departmentService.isDepartment(2l))
	   {
		   return true;
		  
	   }
	   return false;
	  
   }

}

















