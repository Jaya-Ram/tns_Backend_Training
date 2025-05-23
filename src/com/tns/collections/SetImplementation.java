package com.tns.collections;

import java.util.*;

public class SetImplementation {

	public static void main(String[] args) {
		
//		Set<String> names = new HashSet<String>();
		
//		Set<String> names = new LinkedHashSet<String>();
		
		Set<String> names = new TreeSet<String>();
		
		names.add("Jayaram");
		names.add("Balu");
		names.add("Dolly");
		names.add("Chinna");
		names.add("Chinnu");
		names.add("Abhi");
		
		for(String name : names) {
			System.out.println(name);
		}
		
	}
	
}
