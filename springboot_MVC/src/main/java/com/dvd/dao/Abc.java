package com.dvd.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dvd.model.Employee;

@Component
public class Abc implements EmployeeDao {

	@Override
	public int saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
