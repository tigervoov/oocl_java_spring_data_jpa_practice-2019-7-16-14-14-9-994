package com.tw.apistackbase.repository;

import com.tw.apistackbase.core.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees,Long> {
}
