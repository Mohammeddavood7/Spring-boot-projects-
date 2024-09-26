package com.dvd.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dvd.entity.Department;

public interface DepartmentRespository extends JpaRepository<Department, Long>
{
   
	@Query(value="select * from department",nativeQuery=true)
	List<Department> getAllDepartment();
	
	
	@Query("from Department where deptId =?1")
	Department getDepartment(Long id);
	
	@Query("from Department where deptId =?1 or deptLocation=?2")
	List<Department> whereDepartment(long id,String loc);
	
	

}

















