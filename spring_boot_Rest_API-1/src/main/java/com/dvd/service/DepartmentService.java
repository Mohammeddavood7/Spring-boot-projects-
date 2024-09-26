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
	
	public Department saveDepartment(Department dept)
	{
		return departmentRepository.save(dept);
	}
	
	public List<Department> getAddressByDepartment(String adddress)
	{
		
		return departmentRepository.findByDeptLocation(adddress);
		
	}
	
	public List<Department> getAllByDepartment()
	{
		
		return departmentRepository.findAll();
		
	}
	
	public void deleteDepartment(Long deptId)
	{
		 departmentRepository.deleteById(deptId);
		
	}
	
	public Department updateDepartment(Department department)
	{
		return departmentRepository.save(department);  
	}
	
	
	
	
	
	


	

	
}
















