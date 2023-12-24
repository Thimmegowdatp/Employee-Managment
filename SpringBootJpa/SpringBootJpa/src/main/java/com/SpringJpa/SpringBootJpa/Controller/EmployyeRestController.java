package com.SpringJpa.SpringBootJpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringJpa.SpringBootJpa.Model.Employee;
import com.SpringJpa.SpringBootJpa.Service.EmployeeService;

@RestController
public class EmployyeRestController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/findById/{id}")
	public Employee findById(@PathVariable int id) {
		return employeeService.findById(id);
	}

	@PostMapping("/createEmployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@GetMapping("/findAllEmployee")
	public List<Employee> findAllEmployee() {
		return employeeService.findAllEmployee();
	}

	@PutMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}

}
