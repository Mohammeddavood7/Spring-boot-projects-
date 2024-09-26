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
     
    public Department updateViewDepartment(Long id)
    {
    	 Department department = departmentRepository.findById(id).get();
    	 return department;
    }
    
    public void deleteDepartment(Long id)
    {
       departmentRepository.deleteById(id);	
    }
     
    
    public Department updateDepartment(Department department)
    {
    	return departmentRepository.save(department);
    }
}


















