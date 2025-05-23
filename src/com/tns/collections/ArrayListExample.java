package com.tns.collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		// Adding Elements into ArrayList
		list.add("Abhi");
		list.add("Balu");
		list.add("Chinnu");
		list.add("Chinna");
		list.add("Dolly");
		
		// Accessing Ele's
		System.out.println("Element at Index 2: " + list.get(0));

		// Iterating over ele's
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println(list.size());
		
		// Removing ele's
		list.remove(4);
		System.out.println();
		
		list.set(2, "Jayaram Bellamkonda");
		
//		list.clear();
		
		// Iterating over ele's
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println(list.size());
		
		System.out.println(list.contains("Jayaram Bellamkonda"));
		
		System.out.println(list.indexOf("Jayaram Bellamkonda"));
		
		System.out.println(list.isEmpty());
	}

}
