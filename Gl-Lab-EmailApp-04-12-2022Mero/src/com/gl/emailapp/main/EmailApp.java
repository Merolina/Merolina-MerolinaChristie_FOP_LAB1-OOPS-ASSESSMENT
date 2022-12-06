package com.gl.emailapp.main;

import java.util.Scanner;

import com.gl.emailapp.model.Employee;
import com.gl.emailapp.service.CredentialService;
import com.gl.emailapp.service.CredentialServicesImpl;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialService service = new CredentialServicesImpl();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your First Name");
		String firstName = sc.next();
		System.out.println("Please enter your Last Name");
		String lastName = sc.next();
		Employee employee = new Employee(firstName, lastName);

		String dept = null;
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Press 1 for Technical department");
		System.out.println("2. Press 2 for Admin department");
		System.out.println("3. Press 3 for HR department");
		System.out.println("4. Press 4 for Legal department");
		System.out.println("---------------------------------");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			dept = "tech";
			break;
		case 2:
			dept = "admin";
			break;
		case 3:
			dept = "hr";
			break;
		case 4:
			dept = "legal";
			break;
		default:
			System.out.println("Please enter the correct choice");
			break;
		}

		service.emailGenerator(employee, dept);
		service.displayCredentials(employee, dept);
	}

}
