package com.collection;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		
		ArrayList Vishal = new ArrayList();
		Vishal.add("Java");
				System.out.println(Vishal);
		Vishal.add("Puja");
		System.out.println(Vishal);
Vishal.remove("Puja");
System.out.println(Vishal);

Vishal.add(0,"Rani");
System.out.println(Vishal);

ArrayList Akshay = new ArrayList ();
Akshay.add("Komal");
Akshay.add("Pranav");
Vishal.addAll(Akshay);
System.out.println(Vishal);
System.out.println(Vishal.size());
System.out.println(Vishal.contains("Java"));
System.out.println(Vishal.isEmpty());
System.out.println(Vishal.get(0));
System.out.println(Vishal.indexOf("Pranav"));
Vishal.add(1);

Vishal.add("Rani");
System.out.println(Vishal);

HashSet hs = new HashSet();
hs.add(1);
hs.add(2);
hs.add(3);
hs.add(3);
hs.add(10);
hs.add("abc");
hs.add(true);
System.out.println(hs);
System.out.println(hs);



		
		
	}
	
	

}
