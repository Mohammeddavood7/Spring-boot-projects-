package com.dvd.dao;

import java.util.List;

import com.dvd.model.Employee;

public interface EmployeeDao 
{
	public int saveEmployee(Employee emp);
	public int updateEmployee(Employee emp);
	public int deleteEmployee(Integer id);
	public Employee getEmployee(Integer id);
	public List<Employee> getAllEmployee();

}


















