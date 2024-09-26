package com.dvd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvd.entity.Department;
import com.dvd.repository.DepartmentRepository;

@Service
public class DepartmentService 
{
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
     public List<Department> showAllDepartments()
     {
		return departmentRepository.findAll();
     }
     
     public Department saveDepartment(Department department)
     {
    	 return departmentRepository.save(department);
     }
}


















