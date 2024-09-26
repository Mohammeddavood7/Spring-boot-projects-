package com.dvd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dvd.entity.Department;
import com.dvd.service.DepartmentService;

@RestController
public class DepartmentController
{
    
	@Autowired
	private DepartmentService departmentService;
	
   
   @PostMapping("/saveDepartment")
   public Department saveDepartment(@RequestBody Department department)
   {
	  return departmentService.saveDepartment(department);
   }
   
   
   @GetMapping("/getAddressByDepartment/{addres}")
   public List<Department> getAddressByDepartment(@PathVariable("addres") String address)
   {
	  return departmentService.getAddressByDepartment(address);
   } 
   
   
   @GetMapping("/getAllByDepartment")
   public List<Department> getAllByDepartment()
   {
	  return departmentService.getAllByDepartment();
   } 
   
   
   
   @DeleteMapping("/deleteDepartment/{id}")
   public void deleteDepartment(@PathVariable("id") Long deptId)
   {
	   departmentService.deleteDepartment(deptId);
   }
   
   @org.springframework.transaction.annotation.Transactional
   @PutMapping("/updateDepartment")
   public Department updateDepartment(@RequestBody Department department)
   {
	   return departmentService.updateDepartment(department);
   }
   
   
   
}

















