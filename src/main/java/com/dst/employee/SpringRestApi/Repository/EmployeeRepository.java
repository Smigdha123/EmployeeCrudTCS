package com.dst.employee.SpringRestApi.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.dst.employee.SpringRestApi.Model.Employees;


@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {
	
}
