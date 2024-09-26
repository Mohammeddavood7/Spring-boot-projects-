package com.dvd;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dvd.entity.Department;
import com.dvd.respository.DepartmentRespository;
@SpringBootTest
public class SpringData02ApplicationTests 
{
     @Autowired
	private DepartmentRespository departmentRespository;
	
	
	//@Test
	void saveDepartment() 
	{
	    Department d = new Department("Tester","Bangalore");
		departmentRespository.save(d);
		
	}
	
	//@Test
	void getAllDepartments()
	{
		departmentRespository.getAllDepartment().forEach(System.err::println);
	}

	
	@Test
	void getDepartments()
	{
		Department department = departmentRespository.getDepartment(1L);
		System.err.println(department);
	}
	
	@Test
	void whereDepartments()
	{
		List<Department> department = departmentRespository.whereDepartment(1l, "kerala");
		department.forEach(System.err::println);
	}

}
















