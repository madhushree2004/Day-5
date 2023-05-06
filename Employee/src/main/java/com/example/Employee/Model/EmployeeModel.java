package com.example.Employee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeModel {
	@Id
	private int id;
	private String name1;
	private String age1;
	private int salary1;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name;
	}
	public String getAge() {
		return age1;
	}
	public void setAge(String age) {
		this.age1 = age;
	}
	public int getSalary() {
		return salary1;
	}
	public void setSalary(int salary) {
		this.salary1 = salary;
	}
	
}
