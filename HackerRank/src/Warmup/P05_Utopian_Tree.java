package Warmup;

import java.util.Scanner;

public class P05_Utopian_Tree {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int countOfCycle = in.nextInt();
		
		int[] A = new int[countOfCycle];
		for(int i = 0; i < A.length; i++){
			A[i] = in.nextInt();
			if (A[i] > 60) A[i] = 60;
			else if (A[i] < 0) A[i] = 0;
		}
		
		
		for(int i = 0; i < A.length; i++){
			int tmp = 1;
			while(A[i] > 0){
				int tmp2 = A[i] % 2;
				
				if (tmp2 != 0) tmp += 1;
				else tmp *= 2;
				
				--A[i];
			}
			
			System.out.println(tmp);
		}
		
		
	}
}
