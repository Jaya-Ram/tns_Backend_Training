package com.tns.collections;

import java.util.*;
 
public class QueueImple {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		queue.add(19);
		queue.add(10);
		queue.add(14);
		queue.add(9);
		queue.add(12);
		queue.add(10);
		
		queue.remove();
		
		for(int num : queue) {
			System.out.println(num);
		}
		
	}
	
}
