package com.dvd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvd.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> 
{
	List<Department> findByDeptLocation(String address);

}








