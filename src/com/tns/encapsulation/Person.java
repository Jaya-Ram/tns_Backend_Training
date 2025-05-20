package com.tns.encapsulation;

public class Person {

	private int age;
	private String userName;
	private int personId;
	
//	public Person(int age, String userName, int personId){
//		this.age = age;
//		this.userName = userName;
//		this.personId = personId;
//	}
	
	// getters
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return userName;
	}
	 
	public int getPersonId() {
		return personId;
	}
	
	//setters
	
	public void setAge(int age) {
		if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }	}
	
	public void setName(String userName) {
		this.userName = userName;
	}
	
	public void setpersonId(int personId) {
		this.personId = personId;
	}
}
