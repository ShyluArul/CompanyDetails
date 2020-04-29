package com.companydetails.service;

import java.util.List;
import com.companydetails.entities.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee findByEmployeeId(Long employeeId);

	public Employee findByEmployeeName(String employeeName);

	public List<Employee> getByEmployeeSalary(double employeeSalary);
}
