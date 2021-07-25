package com.vivek;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return Arrays.asList(new Employee(1, "Apple"), new Employee(1, "Orange"), new Employee(3, "Mango"));
	}

}
