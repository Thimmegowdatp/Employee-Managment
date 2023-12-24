package com.SpringJpa.SpringBootJpa.Service;

import java.util.List;

import com.SpringJpa.SpringBootJpa.Model.Employee;

public interface EmployeeService {

	public Employee findById(int id);

	public Employee createEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public List<Employee> findAllEmployee();

	public void deleteEmployee(int id);

}
