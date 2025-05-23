package com.tns.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSort {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		
		for(int i = 50; i>0; i--) {
			list.add(i);
		}
		
		for(int num : list) {
			System.out.println(num);
		}
		
		Collections.sort(list);
		
		for(int num : list) {
			System.out.println(num);
		}
		
	}
	
}
