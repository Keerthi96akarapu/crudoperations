package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;
	
	public List<Employee> getAll(int id) {
		return emprepo.findAll();
	}
	public Employee addEmp(Employee name) {
		return emprepo.save(name);
	}
	public Employee updateEmp(int id, Employee name) {
		return emprepo.save(name);
	}
	public String deleteEmp(int id) {
		 emprepo.deleteById(id);
		 return "delete" + id;
	}
	
}
