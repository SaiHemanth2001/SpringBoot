package com.stl.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stl.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
