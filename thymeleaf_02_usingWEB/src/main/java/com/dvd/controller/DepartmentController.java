package com.dvd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dvd.entity.Department;
import com.dvd.service.DepartmentService;

@Controller
public class DepartmentController
{
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/showAllDepartments")
	public String showAllDepartments(Model model)
	{
		List<Department> showAllDepartments = departmentService.showAllDepartments();
		model.addAttribute("depts", showAllDepartments);
		return "showAllDepartments";
	}
}


















