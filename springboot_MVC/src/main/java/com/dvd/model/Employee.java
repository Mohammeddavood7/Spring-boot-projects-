package com.dvd.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	private Integer empId;
	private String empName;
	private String empAddress;
	private Double empSal;
	public Employee(String empName, String empAddress, Double empSal) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSal = empSal;
	}
	
	

}












