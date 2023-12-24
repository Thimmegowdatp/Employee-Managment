package com.SpringJpa.SpringBootJpa.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringJpa.SpringBootJpa.Model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepository {

	@Autowired
	private EntityManager entityManager;

//@GetMapping("/finding/{id}")
	public Employee findById(int id) {

		// find Method is used to Find Any One Of This is Selected Entity
		return entityManager.find(Employee.class, id);

	}

	public Employee createEmployee(Employee employee) {
		// Merge Method Perform Insert and Update MNethod Both Also
		// Its perform Based on If The id Is Exist its can Update record else Its Create
		// the record
		return entityManager.merge(employee);
	}

	public Employee updateEmployee(Employee employee) {
		return entityManager.merge(employee);
	}

	public List<Employee> findAllEmployee() {
		TypedQuery<Employee> query = entityManager.createNamedQuery("select_all_employee", Employee.class);
		return query.getResultList();
	}

	public void deleteEmployee(int id) {
		Employee employee = findById(id);
		entityManager.remove(employee);
	}

}
