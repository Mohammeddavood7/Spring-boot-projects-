package com.dvd.model;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dvd.dao.EmployeeDao;

@SpringBootTest
class SpringbootJdbcApplicationTests
{
	@Autowired
	private EmployeeDao employeedao;

	//@Test
	void saveEmployees()
	{
		Employee emp = new Employee("Murty","Gachiboli",100000d);
		int insert = employeedao.saveEmployee(emp);
		Assertions.assertTrue(insert > 0);
		
	}
	
	
	//@Test
	void updateEmployees()
	{
		Employee emp = new Employee(691,"Mu","Ga",100000d);
		int update = employeedao.updateEmployee(emp);
		Employee employee = employeedao.getEmployee(691);
		Assertions.assertTrue(employee.getEmpName().equals("Mu"));
		Assertions.assertTrue(update > 0);
		
	}
	
	//@Test
	void deleteEmployees()
	{
		int deleteEmployee = employeedao.deleteEmployee(691);
		Assertions.assertTrue(deleteEmployee > 0);
		
	}
	
	//@Test
	void getEmployees()
	{
		Employee getEmployee = employeedao.getEmployee(692);
		System.err.println(getEmployee);
		Assertions.assertNotNull(getEmployee);
		
	}
	
	@Test
		void getAllEmployees()
		{
			List<Employee> allEmployee = employeedao.getAllEmployee();
			allEmployee.forEach(System.err::println);
			Assertions.assertTrue(allEmployee.size() > 0);
			
		}

}












