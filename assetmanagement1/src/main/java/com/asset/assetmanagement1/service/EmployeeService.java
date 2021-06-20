package com.asset.assetmanagement1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asset.assetmanagement1.bean.Employee;
import com.asset.assetmanagement1.exception.EmployeeNotFoundException;
import com.asset.assetmanagement1.model.EmployeeDTO;
import com.asset.assetmanagement1.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeDAOService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee createEmployee(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeDTO, employee);
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployee(Long id) throws EmployeeNotFoundException {

		Optional<Employee> employee = employeeRepository.findById(id);
		if (!employee.isPresent()) {
			throw new EmployeeNotFoundException("Employee Deatils Not Found for Id " + id);
		} else {
			return employee.get();
		}
	}

	@Override
	public List<Employee> list() {

		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(EmployeeDTO employeeDto, Long id) throws EmployeeNotFoundException {

		Optional<Employee> emOptional = employeeRepository.findById(id);
		Employee employee = getEmployeDetails(emOptional);
		
		if(null != employeeDto.getFirstName()) {
			employee.setFirstName(employee.getFirstName());
		}
		if(null != employeeDto.getLastName()) {
			employee.setLastName(employee.getLastName());
		}
		if(null != employeeDto.getEmail()) {
			employee.setEmail(employee.getEmail());
		}
		if(null != employeeDto.getPassword()) {
			employee.setPassword(employee.getPassword());
		}
		if(null != employeeDto.getRole()) {
			employee.setRole(employee.getRole());
		}
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeByEmailAndPassword(String email, String password) throws EmployeeNotFoundException {

		List<Employee> employees = employeeRepository.findByEmailAndPassword(email, password);
		Optional<Employee> empOptional = employees.stream().findFirst();

		return getEmployeDetails(empOptional);
	}

	private Employee getEmployeDetails(Optional<Employee> employeeOptional) throws EmployeeNotFoundException {
		if (employeeOptional.isPresent()) {
			return employeeOptional.get();
		} else {
			throw new EmployeeNotFoundException("Employee Details not found ");
		}
	}
}
