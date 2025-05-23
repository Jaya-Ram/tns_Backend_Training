package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Jayaram");
		names.add("Sathwik");
		names.add("Mani");
		names.add("Rahul");
		names.add("Sai");
		
		Collections.sort(names);
		
		for(String name : names){
		    System.out.println(name);
		}
	}
}
