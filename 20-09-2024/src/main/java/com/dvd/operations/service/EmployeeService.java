package com.dvd.operations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvd.operations.entity.Employee;
import com.dvd.operations.model.EmployeeVo;
import com.dvd.operations.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(EmployeeVo employeeVo)
	{
		
		Employee employee = Employee.builder()
				.empFirstName(employeeVo.getEmpFirstName())
				.empLastName(employeeVo.getEmpLastName())
				.empAddress(employeeVo.getEmpAddress())
				.empSalary(employeeVo.getEmpSalary())
				.deptId(employeeVo.getDeptId())
		        .deptName(employeeVo.getDeptName())
				.build();
		
		return employeeRepository.save(employee);
	}
	
	
	public List<Employee> getEmployees()
	{
		List<Employee> all = employeeRepository.findAll();
		return all;
	}
	
	public Employee getEmployee(Integer empId)
	{
		Employee employee = employeeRepository.findById(empId).get();
		return employee;
	}

}











