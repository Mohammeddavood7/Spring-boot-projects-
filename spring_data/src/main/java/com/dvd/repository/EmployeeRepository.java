package com.dvd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dvd.entity.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	
	
	List<Employee> findByName(String name);
	List<Employee> findByNameAndSal(String name, Double Sal);

	    @Modifying
	    @Transactional
	    @Query("UPDATE Employee e SET e.name = ?2 WHERE e.name = ?1")
	    int updateNameByName(String name1, String name2);
	
}

















