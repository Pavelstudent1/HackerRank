package Warmup;

import java.util.Scanner;

public class P18_Sherlock_and_The_Beast {

	public static void main(String[] args) {
	
Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of tests: ");
		int T = in.nextInt();
		
		int[] tests = new int[T*3];
		System.out.println("Enter N: ");
		for (int i = 0; i < tests.length;) {
			tests[i++] = in.nextInt();
			tests[i++] = in.nextInt();
			tests[i++] = in.nextInt();
		}
		

		
		
		
	}

}
