package com.velocity;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(25);
		al.add(30);
		//System.out.println(al);
		//al.set(2, null);
	
		Iterator<Integer> itr = al.iterator();
		System.out.println(al.get(0));

		while (itr.hasNext()) {
			int i=itr.next();
			System.out.println();
					
		}
	}
	
  
}
