package com.velocity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
	    map.put(10, "ram");
		map.put(12, "Doifode");
		map.put(20, "beed");
	
		Set<Integer> s = map.keySet();
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			int i = itr.next();
			//System.out.println(i);
			//System.out.println(i+ " "+ map.get(i));
			
		}
	}

}
