package Warmup;

import java.util.Scanner;

public class P22_isFibo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter N - number of testing numbers:");
		int N = in.nextInt();

		int[] test = new int [N];
		System.out.println("Enter N number for test:");
		for (int i = 0; i < test.length; i++) {
			test[i] = in.nextInt();
		}
		
		isFibo(test);
//		System.out.println(Fibo(100));
		in.close();
	}

	private static void isFibo(int[] test) {
		
		int fibo_1 = 0;
		int fibo_2 = 1;
		int fibo = 0;
		
		boolean[] result = new boolean[test.length];
		
		for(int i = 2; i <= 46; i++){
			fibo = (fibo_1 + fibo_2);
			fibo_1 = fibo_2;
			fibo_2 = fibo;
			
			for (int j = 0; j < test.length; j++) {
				if (test[j] == fibo){
						result[j] = true;
				}
			}
			
		}
		
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i] + 
					(result[i] == true ? " IsFibo" : " IsNotFibo"));
		}
	}
	
	
	private static int Fibo(int num)
	{
		int fibo_1 = 0;
		int fibo_2 = 1;
		int fibo = 0;
		
		//Число Фибоначчи выше 46 не умещается в 4-х байтный integer
		for(int i = 2; i <= 46; i++){
			fibo = (fibo_1 + fibo_2);
			fibo_1 = fibo_2;
			fibo_2 = fibo;
//			System.out.println("Fibo " + i + " = " + fibo);
		}
		
		return fibo;
	}
	
}
