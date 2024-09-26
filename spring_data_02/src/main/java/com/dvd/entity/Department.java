package com.dvd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deptId;//dept_id; like it store in the databases
	private String deptName;
	private String deptLocation;
	public Department(String deptName, String deptLocation) {
		super();
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}
    
}











