package Warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class P11_ACM_IPCPC_Team {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("1st - peoples, 2nd - topics: ");
		int N = in.nextInt();
		int M = in.nextInt();
		
		String[] lines = new String[N];
		System.out.println("Enter a string peoples-topics:");
		for (int i = 0; i < N; i++) {
			lines[i] = in.next();
		}
		
		
		output(lines, M);
		
		in.close();
	}

	private static void output(String[] lines, int m) {
		
		int max_real = 0,		//максимальное число известных тем вообще
			max_current = 0;	//максимальное число тем, известных команде из 2-х человек
		ArrayList<String> pairs = new ArrayList<String>(); //количество команд с макс. числом известных тем
		
		for (int i = 0; i < lines.length - 1; i++) { //цикл, отбрасывающий повторные переборы команд(напр., (1,2) и (2,1)
			for (int j = i + 1; j < lines.length; j++) {
				
				max_current = //вычисляем текущий максимум тем конкретной команды
						Integer.parseInt(lines[i], 2) | Integer.parseInt(lines[j], 2);
				
				if (max_current > max_real){ //если больше максимума...
					if (!pairs.isEmpty())	 //при непустом массиве - убрать предыдущее, 
						pairs.remove(0);	 //которое по определению меньше текущего
					pairs.add("(" + (i + 1) + "," + (j + 1) + ") = " + max_current); //...добавляем в массив
					max_real = max_current;		//повышаем потолок максимума
				}
				else if (max_current == max_real){ //если максимум равен предыдущему, то добавляем егов массив
					pairs.add("(" + (i + 1) + "," + (j + 1) + ") = " + max_current);
				}
				
				System.out.printf("Pair(%d,%d) = %d\n", i + 1, j + 1, max_current);
			}
		}
		
		System.out.println("Max number of topics that 2-p team know is " + Integer.bitCount(max_real) + 
							"\nNumber of 2-person team that know max of topics is " + pairs.size());
		
	}

}
