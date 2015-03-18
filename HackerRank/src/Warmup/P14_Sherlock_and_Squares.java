package Warmup;

import java.util.Scanner;

public class P14_Sherlock_and_Squares {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Number of testes: ");
		int N = in.nextInt();
		
		
		int[] tests = new int[N*2];
		System.out.println("Enter A and B: ");
		for (int i = 0; i < tests.length;) {
			tests[i++] = in.nextInt();
			tests[i++] = in.nextInt();
		}
		
		
		fullsquares(tests);
		
		in.close();
	}

	private static void fullsquares(int[] tst) {
		
		int countOfSquares = 0;
		
		for (int i = 0; i < tst.length; i += 2) {
			
			for (int j = tst[0 + i]; j <= tst[1 + i]; j++) {
				
				if (Math.sqrt(j) % 1 == 0)
					++countOfSquares;
				
			}
			
			System.out.println(countOfSquares);
			countOfSquares = 0;
		}
	
		
		
	}
}
