package com.asset.assetmanagement1.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.asset.assetmanagement1.bean.Employee;
import com.asset.assetmanagement1.exception.EmployeeNotFoundException;
import com.asset.assetmanagement1.model.EmployeeDTO;

@Repository
@Transactional
public interface EmployeeDAOService {

	public Employee createEmployee(EmployeeDTO employeeDTo);

	public Employee getEmployee(Long Id) throws EmployeeNotFoundException;

	public List<Employee> list();

	public Employee updateEmployee(EmployeeDTO employee, Long Id) throws EmployeeNotFoundException;
	
	public Employee getEmployeByEmailAndPassword(String email, String password) throws EmployeeNotFoundException;

}