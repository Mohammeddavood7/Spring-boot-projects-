package com.dvd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer id;

	@Column(name = "emp_name")
	private String name;

	@Column(name = "emp_address")
	private String address;

	@Column(name = "emp_sal")
	private Double sal;

	public Employee(String name, String address, Double sal)
	{
		super();
		this.name = name;
		this.address = address;
		this.sal = sal;
	}

	

}










