package com.dvd.operations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvd.operations.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
