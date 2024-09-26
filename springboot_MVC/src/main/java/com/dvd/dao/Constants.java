package com.dvd.dao;

public class Constants {
	static String INSERT = "insert into employee(empName,empAddress,empSal) values(?,?,?)";
	static String UPDATE = "update employee set empName=?,empAddress=?,empSal=? where  empId=?";
	static String DELETE = "delete from employee where empId = ?";
	static String GET_ONE = "select * from employee where empId = ?";
	static String GET_ALL = "select * from employee";

}
