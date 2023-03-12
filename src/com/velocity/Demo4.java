package com.velocity;

import java.util.HashMap;

public class Demo4 {

	public static void main(String[] args) {
		String string = "shriram";
		char [] c=string.toCharArray();
		
	
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		for(char a: c) {
			hs.put(a, 0);
				
		}
		
		for(char a: c) {
		if(hs.containsKey(a)) {
			hs.put(a, hs.get(a)+1);
		}
		}
		System.out.println(hs);
	}
	

	}


