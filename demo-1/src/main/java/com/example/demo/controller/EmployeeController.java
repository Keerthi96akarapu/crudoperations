package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	 
	@GetMapping("/getemp/{id}")
	public List<Employee> getEmp(@RequestBody int id){
		return service.getAll(id);
	}
	@PostMapping("/addemp")
	public Employee addEmployee(@RequestBody Employee name) {
		return service.addEmp(name);
	}
	
	@PutMapping ("/updateemp/{id}")
	public Employee updateEmployee(@PathVariable int id,@RequestBody Employee name) {
		return service.updateEmp(id, name);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(int id) {
		service.deleteEmp(id);
		return "deleted " + id;
	}
	
}
