package Warmup;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P21_Cut_the_sticks {
	
	private static final int MAX_N = 1000;
	private static final int MAX_A = 1000;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter N - number of sticks:");
		int N = in.nextInt();

		int[] sticks = new int [N];
		System.out.println("Enter N sticks with unique length:");
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] = in.nextInt();
			
		}
		
		cutTheSticks(sticks);
		
		int[] rndm = RndmSticks();
		long s = System.currentTimeMillis();
		cutTheSticks(rndm);
		long e = System.currentTimeMillis();
		System.out.println("Elapsed = " + (e - s));
		
		
		in.close();
	}

	private static int[] RndmSticks() {
		
		int[] a = new int[MAX_N];
		Random random = new Random();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(MAX_A) + 1;
		}
		
		return a;
	}

	private static void cutTheSticks(int[] st) {
		
		System.out.println(st.length);
		
		int[] aux = new int[st.length];
		System.arraycopy(st, 0, aux, 0, st.length);
		Arrays.sort(aux);
		
		int lessest = aux[0];
		int shift = 0;
		
		while(true){
			
			int count = 0;
			for (int i = shift; i < aux.length; i++) {
				if (aux[i] <= lessest){
							++shift;
							aux[i] = 0;
				}
				else{
					aux[i] -= lessest;
					++count;
				}
			}
			
			if (count == 0) 
				break;
			else 
				System.out.println(count);
			
		}
		
	}

}
