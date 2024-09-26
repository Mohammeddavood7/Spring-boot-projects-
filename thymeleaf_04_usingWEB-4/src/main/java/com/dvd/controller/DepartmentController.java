package com.dvd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	
	@GetMapping("/addDepartmentViewFile")
	public String addDepartmentViewFile(Model model)
	{ 
		model.addAttribute("depts",new Department("dept name","dept location"));
		return "addDepartmentViewFile";
	}
	
	@PostMapping("/addDepartmentFile")
	public String addDepartmentFile(@ModelAttribute Department department, Model model)
	{ 
		departmentService.saveDepartment(department);
		return "redirect:/showAllDepartments";
	}
	
	@GetMapping("/updateViewDepartment/{id}")
	public String updateViewDepartment(@PathVariable("id") Long deptId,Model model)
	{ 
		Department updateDepartment = departmentService.updateViewDepartment(deptId);
		model.addAttribute("update", updateDepartment);
		return "updateDepartment";
	}
	
	@PostMapping("/updatedDepartment")
	public String updatedDepartment(@ModelAttribute Department department,Model model)
	{
		departmentService.updateDepartment(department);
		return "redirect:/showAllDepartments";
	}
	
	@GetMapping("/deleteDepartment/{id}")
	public String deleteDepartment(@PathVariable("id") Long deptId)
	{ 
		departmentService.deleteDepartment(Long.valueOf(deptId));
		return "redirect:/showAllDepartments";
	}
	
	
	
	
}


















