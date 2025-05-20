package com.tns.takinginput;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EmployeeDetails {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Employee Name: ");
		String employeeName = br.readLine();
		
		
		System.out.println("Enter Employee ID: ");
		int employeeID = Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter your Designation");
		String designation = br.readLine();
		
		
		System.out.println("Enter your Salary: ");
		double salary = Double.parseDouble(br.readLine());
		
	}
	
}
