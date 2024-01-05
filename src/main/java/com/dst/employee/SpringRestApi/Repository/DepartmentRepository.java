package com.dst.employee.SpringRestApi.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dst.employee.SpringRestApi.Model.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
}
