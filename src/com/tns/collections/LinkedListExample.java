package com.tns.collections;

import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		for(int i=10; i<20; i++) {
			list.add(i);
		}
		
		for(int num : list) {
			System.out.println(num);
		}
	}
	
}
