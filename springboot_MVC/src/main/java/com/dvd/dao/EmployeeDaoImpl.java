package com.dvd.dao;

import static com.dvd.dao.Constants.DELETE;
import static com.dvd.dao.Constants.GET_ALL;
import static com.dvd.dao.Constants.GET_ONE;
import static com.dvd.dao.Constants.INSERT;
import static com.dvd.dao.Constants.UPDATE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dvd.model.Employee;

@Component("emp1")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private EmployeeRowMapper employeeRowMapper;
	
	@Override
	public int saveEmployee(Employee emp) 
	{
		Object empData[] = {emp.getEmpName(),emp.getEmpAddress(),emp.getEmpSal()};
		return jdbcTemplate.update(INSERT,empData);
	}

	@Override
	public int updateEmployee(Employee emp)
	{
		Object empData[] = {emp.getEmpName(),emp.getEmpAddress(),emp.getEmpSal(),emp.getEmpId()};
		return jdbcTemplate.update(UPDATE,empData);
	}

	@Override
	public int deleteEmployee(Integer id) {
		
		return jdbcTemplate.update(DELETE,id);

	}

	@Override
	public Employee getEmployee(Integer id) {
		List<Employee> query = jdbcTemplate.query(GET_ONE,employeeRowMapper,id);
		return query.get(0);
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		return jdbcTemplate.query(GET_ALL,employeeRowMapper);
	}

}
