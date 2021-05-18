package com.codeclan.example.DepartmentEmployeeProject;

import com.codeclan.example.DepartmentEmployeeProject.models.Department;
import com.codeclan.example.DepartmentEmployeeProject.models.Employee;
import com.codeclan.example.DepartmentEmployeeProject.models.Project;
import com.codeclan.example.DepartmentEmployeeProject.repositories.DepartmentRepository;
import com.codeclan.example.DepartmentEmployeeProject.repositories.EmployeeRepository;
import com.codeclan.example.DepartmentEmployeeProject.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

		@RunWith(SpringRunner.class)
		@SpringBootTest
		public class DepartmentEmployeeProjectApplicationTests {

			@Autowired
			DepartmentRepository departmentRepository;

			@Autowired
			EmployeeRepository employeeRepository;

			@Autowired
			ProjectRepository projectRepository;

			@Test
			public void contextLoads() {
			}

			@Test
			public void testRelationships(){
				Department dept1 = new Department("Marketing");
				departmentRepository.save(dept1);

				Employee employee1 = new Employee("Harry", "Jones", 32, dept1);
				employeeRepository.save(employee1);

				Project project1 = new Project("McDonald", 1);
				projectRepository.save(project1);

				dept1.addEmployee(employee1);
				departmentRepository.save(dept1);

				Project project2 = new Project("X", 5);

				project1.addEmployee(employee1);
				project2.addEmployee(employee1);
				projectRepository.save(project1);
				projectRepository.save(project2);
			}
		}
