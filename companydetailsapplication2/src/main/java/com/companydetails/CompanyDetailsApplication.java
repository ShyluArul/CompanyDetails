package com.companydetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.companydetails.repository.EmployeeRepository;

@SpringBootApplication
public class CompanyDetailsApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(CompanyDetailsApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Employee e1 = new Employee("Manoj", "Chennai", "sales", 9000); Employee e2 =
		 * new Employee("Mohan", "Bangalore", "finance", 20000); Employee e3 = new
		 * Employee("Kishore", "Chennai", "sales", 9500); Employee e4 = new
		 * Employee("John", "Kerala", "marketting", 18000); employeeRepository.save(e1);
		 * employeeRepository.save(e2); employeeRepository.save(e3);
		 * employeeRepository.save(e4);
		 */
	}
}