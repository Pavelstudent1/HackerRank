package Warmup;

import java.util.Scanner;

public class P23_Service_Lane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter N - length of freeway\n"
				+ "Enter T - number of tests:");
		int N = in.nextInt();
		int T = in.nextInt();

		int[] servlane_width = new int [N];
		System.out.println("Enter sercice lane widths:");
		for (int i = 0; i < servlane_width.length; i++) {
			servlane_width[i] = in.nextInt();
		}
		
		int[] tstcases = new int[T*2];
		System.out.println("Enter two integer - test cases:");
		for (int i = 0; i < tstcases.length;) {
			tstcases[i++] = in.nextInt();
			tstcases[i++] = in.nextInt();
		}
		
		
		results(servlane_width, tstcases);
		
		in.close();
	}

	private static void results(int[] slane, int[] cases) {
		
		
		for (int i = 0; i < cases.length; i += 2) {
			int in = cases[0 + i];
			int out = cases[1 + i];
			
			int largest_vehicle = 3;
			for (int j = in; j <= out; j++) {
				if (slane[j] < largest_vehicle)
					largest_vehicle = slane[j];
			}
			
			System.out.println(largest_vehicle);
		}
	}

}
