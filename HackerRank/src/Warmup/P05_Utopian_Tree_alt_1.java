package Warmup;

import java.util.Scanner;

public class P05_Utopian_Tree_alt_1 {

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
			//int tmp = (1 << ((A[i] / 2) + 1)) - 1; //быстрый счёт только чётных периодов
			int tmp;
		}
		
		

	}

}
