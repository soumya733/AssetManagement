package com.asset.assetmanagement1.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asset.assetmanagement1.bean.Employee;
import com.asset.assetmanagement1.exception.EmployeeNotFoundException;
import com.asset.assetmanagement1.model.EmployeeDTO;
import com.asset.assetmanagement1.service.EmployeeDAOService;
@RestController

public class EmployeeController {

	@Autowired
	EmployeeDAOService employeeDaoService;
	
	
	@RequestMapping("/employee")

	public List<Employee> getAllEmployes (){
		return employeeDaoService.list();
	}
	
	@PostMapping("/save")
	public Employee createEmployee (@Valid @RequestBody EmployeeDTO employeDTO){
		return employeeDaoService.createEmployee(employeDTO);
	}
	
	@GetMapping("/{Id}")
	public Employee getEmployee (@PathVariable Long Id) throws EmployeeNotFoundException{
		return employeeDaoService.getEmployee(Id);
	}
	
	@PutMapping("/employee/{Id}")
	public Employee updateEmployee (@RequestBody EmployeeDTO employee, @PathVariable Long Id)throws EmployeeNotFoundException{
		return employeeDaoService.updateEmployee(employee, Id);
	}
	
	@PostMapping("/login")
	public Employee login (@RequestBody Employee employee, @PathVariable Long Id) throws EmployeeNotFoundException{
		return employeeDaoService.getEmployeByEmailAndPassword(employee.getEmail(), employee.getPassword());
	}
}