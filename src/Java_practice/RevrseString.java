package Java_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

import collection.List;

public class RevrseString {
	public static void main(String[] args) {
		RevrseString rs = new RevrseString();
		/*
		 * rs.reversebyStringBuffer("Akshay"); rs.reversebyStringBuilder("Vishal");
		 * rs.reverseChararray("Pranav"); rs.reversecharAT("Shinde"); int [] arr=
		 * {12,15,7,2,4,9,3}; rs.findLargestansSmallest(arr); rs.sorting(arr);
		 * rs.countofOccurance("Akshay"); rs.duplicate("Akshayaaaassshhyy");
		 * rs.removeDuplicate("Akshayaaaassshhyy");
		 */
		// rs.pattern1(5);
		// rs.pattern2(5);
		// rs.pattern3(5);
		// rs.pattern4(5);
		//rs.pattern5(5);
		//rs.pattern6(5);
		//rs.pattern6(5);
		rs.fibnociiSeries(100);
	}

	public void reversebyStringBuffer(String string) {

		StringBuffer name = new StringBuffer(string);
		name.reverse();
		System.out.println(name);
	}

	public void reversebyStringBuilder(String string) {
		StringBuilder name = new StringBuilder(string);
		name.reverse();
		System.out.println(name);
	}

	/*
	 * public void reverseCollection(String string) { ArrayList ar = new
	 * ArrayList(); char [] c = string.toCharArray(); for (char d:c) { ar.add(d); }
	 * Collections.reverse(ar); Iterator itr =ar.iterator(); if(itr.hasNext()) {
	 * System.out.println(itr.next()); } }
	 */
	public void reverseChararray(String string) {
		char[] c = string.toCharArray();
		String rev = "";
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		System.out.println(rev);
	}

	public void reversecharAT(String string) {
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}
		System.out.println(rev);
	}

	public void findLargestansSmallest(int[] number) {
		int largest = number[0];
		int small = number[0];
		int secondlargest = number[0];

		for (int i = 0; i < number.length; i++) {
			if (small > number[i]) {
				small = number[i];
			}
			if (largest < number[i]) {
				secondlargest = largest;
				largest = number[i];
			} else if (secondlargest < number[i]) {
				secondlargest = number[i];
			}
		}
		System.out.println("Largest" + largest);
		System.out.println("Scond Largest" + secondlargest);
		System.out.println("Smallest" + small);
	}

	public void sorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tempo = arr[j];
					arr[j] = arr[i];
					arr[i] = tempo;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a);
			System.out.print(" ");
		}

	}

	public void countofOccurance(String string) {
		char c[] = string.toCharArray();
		HashMap<Character, Integer> hs = new HashMap<>();
		for (char d : c) {
			if (hs.containsKey(d)) {
				hs.put(d, hs.get(d) + 1);
			} else {
				hs.put(d, 1);
			}
		}
		System.out.println(hs);
		System.out.println(hs.entrySet());
		System.out.println(hs.keySet());
	}

	public void duplicate(String string) {
		LinkedHashSet ar = new LinkedHashSet<>();
		char[] c = string.toCharArray();

		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					ar.add(c[i]);
				}
			}
		}
		System.out.println(ar);

	}

	public void removeDuplicate(String string) {
		char[] c = string.toCharArray();
		LinkedHashSet ar = new LinkedHashSet<>();

		for (int i = 0; i < c.length; i++) {
			ar.add(c[i]);
		}
		System.out.println(ar);
	}

	void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void pattern2(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n + 1 - row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n + 1 - row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

void pattern5(int n) {
	  for(int row=1;row<=n;row++) {
		  for(int col=1;col<=n-row;col++) {
			  System.out.print(" ");
		  }
	 	  		  for(int col1=1;col1<=row;col1++) {
			  System.out.print("*");		  
	  }
		  System.out.println();
	  }
}
void pattern6(int n) {
	  for(int row=1;row<=n;row++) {
		  
	 	  		  for(int col1=1;col1<=row-1;col1++) {
			  System.out.print(" ");		  
	  }
	 	  		 for(int col1=1;col1<=n+1-row;col1++) {
	 				  System.out.print("*");		  
	 		  }
	 	  		  
		  System.out.println();
	  }
}
void fibnociiSeries(int n) {
	int a=0;
	int b=1;
	int c=0;
	System.out.print(a+","+b+",");
	while(n>c) {
		System.out.print(c+",");
		a=b;
		b=c;
		 c=a+b;
	}
}
}