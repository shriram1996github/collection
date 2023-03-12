package com.velocity;

import java.util.Scanner;

public class Demo5 {
	
	public static void multiplication (int no) {
		
		for(int i = 1; i<=10; i++) {
		
			int c= no * i;
			System.out.println(no + "*" + i + "=" + c);
		}
	
	}

	public static void main(String[] args) {
		System.out.println("enter the nomber for multiplicaion");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println("value>>"+ x);
		multiplication(x);
		scanner.close();

	}

}
