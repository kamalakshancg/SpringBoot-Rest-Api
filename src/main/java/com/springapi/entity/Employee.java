package com.springapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Employee {
     
	@Id
	private int empId;
	
	@NotEmpty(message = "Employee name cant be empty")
	@Size(min = 3,max = 10)
	private String empName;
	
	@NotEmpty(message="Salary cant be null")
	private int salary;
	
	@NotEmpty(message = "Employee address cant be empty")
	@Size(min = 3,max = 10)
	private String address;
	
	public Employee()
	{
		
	}
	public Employee(int empId, String empName, int salary, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
	
}
