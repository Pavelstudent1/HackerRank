package Warmup;

import java.util.Scanner;

public class P04_Flipping_Bits {

	public static void main(String[] args) {
		
		//Т.к. JAVA не знает, что такое "беззнаковые" int, данная программа имитирует
		//их, путём оперирования long-значениями с последующей обрезкой их до
		//как бы 32-х битных как бы беззнаковых int. Надо для того, чтобы старший разряд
		//не показывал свою "знаковость" и число 4294967295 не превращалось в -1 при
		//реальных 32-х битных int
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter array length: ");
		int arraylength = in.nextInt();
		
		long[] A = new long[arraylength];
	
		System.out.print("Fill the array: ");
		for(int i = 0; i < A.length; i++) 
			A[i] = in.nextLong() & 0x00000000FFFFFFFFL; //здесь, операция & 0x00000000FFFFFFFFL
														//нужна для обрезки long-числа до как бы
														//32-x битного unsinged int 
		
		//по неведомой причине, нельзя использовать for(long i : A), т.к. почему-то
		//операция i = ~i & 0x00000000FFFFFFFFL с значениями i равными 1 и 0 даёт
		//не long-результат (4294967295), а как-будто int (-1)
		for(int i = 0; i < A.length; i++)
			A[i] = ~A[i] & 0x00000000FFFFFFFFL;
		
		for(int i = 0; i < A.length; i++)
			System.out.println(A[i]);
			
		
	}

}
