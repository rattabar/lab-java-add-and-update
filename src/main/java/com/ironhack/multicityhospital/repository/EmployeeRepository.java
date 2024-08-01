package com.ironhack.multicityhospital.repository;

import com.ironhack.multicityhospital.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
