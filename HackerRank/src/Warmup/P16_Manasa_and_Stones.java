package Warmup;

import java.util.Scanner;

public class P16_Manasa_and_Stones {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of tests: ");
		int T = in.nextInt();
		
		int[] tests = new int[T*3];
		System.out.println("Enter n, a, b: ");
		for (int i = 0; i < tests.length;) {
			tests[i++] = in.nextInt();
			tests[i++] = in.nextInt();
			tests[i++] = in.nextInt();
		}
		
		variations(tests);
		
		in.close();
		
	}
	
	
	/**
		Т.к. задание предполагает перебор комбинаций, попробуем обойтись мозгами, а не брутфорсом.
		Если порасписывать возможные комбинации n чисел, приходим к формуле:
		
		1) Число неповторяющихся комбинаций равно n (если расписать комбинации, то по сумме, 
		   комбинации 1 + 1 + 2, 1 + 2 + 1, 2 + 1 + 1 равны)
		2) Умножение заменяет сложение, поэтому получаем формулу
		   для подсчёта комбинаций:
			
			(down * x) + (up * y), где up - счётчик от 0 до n, увеличивающийся на 1 за цикл
									   down - счётчик от n до 0, уменьшающийся на 1 за цикл
									   x и y - заданные числа
									   Цикл вертится от 0 до n
									   
			Т.о. перебираются все возможные неповторяющиеся комбинации
		
	**/
	private static void variations(int[] t) {
		
		long cur_sum = 0;
		
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < t.length; i += 3) {
			
			for (int j_dn = t[0 + i] - 1, 
					 j_up = 0; 
					 j_up < t[0 + i]; 
					 j_dn--, j_up++) 
			{
				cur_sum = (j_dn*t[1 + i] + j_up*t[2 + i]);
				str.append(String.valueOf(cur_sum) + " ");
			}
			
			str.append("\n");
		}
		
		
		System.out.println(str);
		
	}
	
}
