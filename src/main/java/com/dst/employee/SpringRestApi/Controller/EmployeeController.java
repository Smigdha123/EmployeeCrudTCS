package com.dst.employee.SpringRestApi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dst.employee.SpringRestApi.Model.Employees;
import com.dst.employee.SpringRestApi.Repository.EmployeeRepository;
import com.dst.employee.SpringRestApi.Request.EmployeeEntity;

@RestController
public class EmployeeController {	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/insertAndUpdateEmployee")
	public void saveEmployee (@RequestBody EmployeeEntity employee) {		
		Employees employeeRecord = new Employees();
		employeeRecord.setId(employee.getId());
		employeeRecord.setName(employee.getName());
		employeeRepository.save(employeeRecord);		
	}
	
	
	@PutMapping("/updateEmployee")
	public void updateEmployee (@RequestBody EmployeeEntity employee) {		
		Employees employeeRecord = new Employees();
		employeeRecord.setId(employee.getId());
		employeeRecord.setName(employee.getName());
		employeeRepository.save(employeeRecord);			
	}
	
	@GetMapping("/getAllEmployees/")
	public List<Employees> getAllEmployees () {		
		return employeeRepository.findAll();
	}
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employees> getEmployee (@RequestParam Long id) {		
		return employeeRepository.findById(id);		
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee (@RequestParam Long id) {				
		employeeRepository.deleteById(id);				
	}
	
}
