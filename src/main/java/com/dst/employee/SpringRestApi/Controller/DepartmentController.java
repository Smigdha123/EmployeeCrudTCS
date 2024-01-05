package com.dst.employee.SpringRestApi.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dst.employee.SpringRestApi.Model.Department;
import com.dst.employee.SpringRestApi.Repository.DepartmentRepository;
import com.dst.employee.SpringRestApi.Request.DepartmentEntity;

@RestController
public class DepartmentController {	
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostMapping("/insertAndUpdateDepartment")
	public void saveEmployee (@RequestBody DepartmentEntity department) {		
		Department departmentrecord = new Department();
		departmentrecord.setId(department.getId());
		departmentrecord.setName(department.getName());
		departmentRepository.save(departmentrecord);		
	}
	
	
	@PutMapping("/updateDepartment")
	public void updateEmployee (@RequestBody DepartmentEntity department) {		
		Department departmentrecord = new Department();
		departmentrecord.setId(department.getId());
		departmentrecord.setName(department.getName());
		departmentRepository.save(departmentrecord);	
	}
	
	@GetMapping("/getAllDepartments/")
	public List<Department> getAllDepartments () {		
		return departmentRepository.findAll();
	}
	
	@GetMapping("/getDepartment/{id}")
	public Optional<Department> getDepartment (@RequestParam Long id) {		
		return departmentRepository.findById(id);		
	}
	
	@DeleteMapping("/deleteDepartment/{id}")
	public void deleteDepartment (@RequestParam Long id) {				
		departmentRepository.deleteById(id);				
	}
	
}
