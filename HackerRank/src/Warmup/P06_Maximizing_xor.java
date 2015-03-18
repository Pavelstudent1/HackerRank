package Warmup;

import java.util.Scanner;

public class P06_Maximizing_xor {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int L = in.nextInt(),
			R = in.nextInt();
		
		if (L < 1) L = 1;
		if (R > 1000 ) R = 1000;
		
		maxXor(L,R);
		
		in.close();
	}
	
	private static void maxXor(int L, int R){
		
		int maxXor = 0, A = 0, B = 0;
		
		//BruteForce как есть
		for(int i = L; i <= R; i++){	//берём A = i и проверка начинается
			for(int j = i; j <= R; j++){//т.к. j отражает B, и по условию A <= B, j начинается с i
				if ((i <= j) && ((i ^ j) > maxXor)){		
					maxXor = i ^ j;	   
					A = i;
					B = j;
				}
			}
		}
	System.out.println("A = " + A + ", B = " + B + 
			", MaxXor = " + maxXor);
	}

}
