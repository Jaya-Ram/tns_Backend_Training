package com.tns.takinginput;

import java.util.Scanner;

public class StudentDetails {

	public void takeInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String studentName = sc.nextLine();
		
		System.out.println("Enter your Roll Number: ");
		int rollNumber = sc.nextInt();
		
		System.out.println("Enter your Age: ");
		int studentAge = sc.nextInt();
		
		System.out.println("Enter your Class: ");
		int studentClass = sc.nextInt();
		
		sc.close();
	}
	
	
}
