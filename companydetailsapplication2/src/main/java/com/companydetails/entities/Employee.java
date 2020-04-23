package com.companydetails.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long employeeId;
	public String employeeName;
	public String employeeAddress;
	public String employeeDepartment;
	public double employeeSalary;
	
	public Long getEmployeeId() {
		return employeeId;
	}
    public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
    public String getEmployeeName() {
		return employeeName;
	}
    public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
    public String getEmployeeAddress() {
		return employeeAddress;
	}
    public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
    public String getEmployeeDepartment() {
		return employeeDepartment;
	}
    public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
    public double getEmployeeSalary() {
		return employeeSalary;
	}
    public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
    
    public Employee(String employeeName, String employeeAddress, String employeeDepartment, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
		}
    public Employee() {
		super();
	}
    @Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeeDepartment=" + employeeDepartment + ", employeeSalary=" + employeeSalary
				+ "]";
	}

	
}
