package Warmup;
import java.util.Arrays;
import java.util.Scanner;


public class P08_Max_Min {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N, K;
		do{
			N = Integer.valueOf(in.next());
		}while(N < 2 || N > 100000);
		System.out.println("Done!");
		
		do{
			K = Integer.valueOf(in.next());
		}while(K < 2 || K > N);
		System.out.println("Done!");

		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.valueOf(in.next());
		}
		System.out.println("Done!");
		
		
		maxmin(A, K);
		
	}

	private static void maxmin(int[] a, int K) {
		
		
		int[] fin_array = new int[K];
		
		int unfa = Integer.MAX_VALUE;
		
		Arrays.sort(a);
		
		int e = 0;
		while(e + K < a.length){
			int[] tmp = new int[K];
			System.arraycopy(a, e, tmp, 0, K);
			
			for (int i = 0; i < tmp.length - 1; i++) {
				if (Math.abs(a[i] - a[i + 1]) <= unfa){
					unfa = Math.abs(a[i] - a[i + 1]);
				}
			}
		}

	}
}
