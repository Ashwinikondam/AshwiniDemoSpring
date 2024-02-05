package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Employee findByName(String name);
}