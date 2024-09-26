package com.dvd;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dvd.entity.Employee;
import com.dvd.repository.EmployeeRepository;

@SpringBootTest
class SpringDataApplicationTest {

	@Autowired
	private EmployeeRepository employeeRepository;

//	// @Test
//	void saveEmployee() {
//		Employee emp = new Employee("mahesh", "hyderabad", 8000d);
//		emp = employeeRepository.save(emp);
//		Assertions.assertNotNull(emp.getEmp_id());
//	}
//
//	// @Test
//	void getAllEmployee() {
//
//		List<Employee> emp = employeeRepository.findAll();
//		emp.forEach(System.err::println);
//		Assertions.assertTrue(emp.size() > 0);
//	}
//
//	// @Test
//	void getEmployee() {
//
//		Optional<Employee> emp = employeeRepository.findById(1);
//		if (emp.get() != null) {
//			emp.stream().forEach(System.out::println);
//
//		}
//		Assertions.assertTrue(emp.get().getEmp_id() > 0);
//	}

	//@Test
	void getEmployeeWithName() {

           List<Employee> byEmpName = employeeRepository.findByName("smith");
           byEmpName.stream().forEach(System.out::println);
		   Assertions.assertTrue(byEmpName.size() > 0);
	}
	
	//@Test
	void deleteEmployee() {
          employeeRepository.deleteById(1);
           }
	
	
	//@Test
	void getNameAndSal() 
	{
          List<Employee> byNameAndSal = employeeRepository.findByNameAndSal("mahesh",8000d);
          byNameAndSal.forEach(System.err::println);
          Assertions.assertNotNull(byNameAndSal.get(0));
	}
	
	@Test
		void upadateName() 
		{
	        int updateNameByName = employeeRepository.updateNameByName("mahesh", "smith");
	          Assertions.assertTrue(updateNameByName > 0);

		}
	
	
	
	

}
