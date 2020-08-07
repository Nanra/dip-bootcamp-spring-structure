package com.example.training;

import com.example.training.models.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);

		// Instance Object Model
		Employee dataEmployee = new Employee();

		// Set Attribute Field Value
		dataEmployee.setName("Nanra Sukedy");
		dataEmployee.setAddress("Bandung");
		dataEmployee.setEmail("nanrasukedy@outlook.com");
		dataEmployee.setId("007");
		dataEmployee.setPhone("081234565847");

		// Get Attribute Field Value
		String employeeName = dataEmployee.getName();
		String employeeAddress = dataEmployee.getAddress();
		String employeeEmail = dataEmployee.getEmail();
		String employeePhone = dataEmployee.getPhone();

		// Show Field Value
		System.out.println("Employee Information");
		System.out.println("Name : " + employeeName);
		System.out.println("Address : " + employeeAddress);
		System.out.println("Email : " + employeeEmail);
		System.out.println("Phone Number : " + employeePhone);

	}

}
