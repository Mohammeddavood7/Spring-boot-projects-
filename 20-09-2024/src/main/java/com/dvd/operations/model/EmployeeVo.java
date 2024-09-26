package com.dvd.operations.model;

import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@Builder
public class EmployeeVo 
{
	private Integer empId;
	private String empFirstName;
	private String empLastName;
	private String empAddress;
	private Double empSalary;
	private Integer deptId;
	private String deptName;

}
