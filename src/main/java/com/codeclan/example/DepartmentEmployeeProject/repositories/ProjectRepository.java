package com.codeclan.example.DepartmentEmployeeProject.repositories;

import com.codeclan.example.DepartmentEmployeeProject.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
