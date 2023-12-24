package com.SpringJpa.SpringBootJpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

// need to Map java Class With Database
// properties of  data With Entire Entity

@Entity
@NamedQuery(name = "select_employee", query = "FROM Employee P") // Hiberante Query langauage(HQL)or Java Persistenec
																	// Query Language(JPL)
public class Employee {

	@Id
	@GeneratedValue
	private int id;

	private String firstName;
	private String lastName;
	private long mobileNumber;
	private int age;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
