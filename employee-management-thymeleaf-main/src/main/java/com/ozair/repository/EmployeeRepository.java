package com.ozair.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ozair.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
