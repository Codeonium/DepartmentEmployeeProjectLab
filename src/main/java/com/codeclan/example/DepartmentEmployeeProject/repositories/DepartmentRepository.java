package com.codeclan.example.DepartmentEmployeeProject.repositories;

import com.codeclan.example.DepartmentEmployeeProject.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
