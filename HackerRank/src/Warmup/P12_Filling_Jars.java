package Warmup;

import java.util.Scanner;

public class P12_Filling_Jars {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter N = [3, 10^7]\nand M = [1,10^5]:");
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] commands = new int[M*3]; //значения a,b,k идут последовательно, поэтому
									   //массив в 3 раза больше
		System.out.println("Enter data in format \"a b k\"");
		for (int i = 0; i < commands.length;) {
			commands[i++] = in.nextInt();	//после записи команды, счётчик передвигается инкрементом
			commands[i++] = in.nextInt();
			commands[i++] = in.nextInt();
		}
		
		
		System.out.println(GIF(N, commands));
		in.close();
	}

	private static int GIF(int N, int[] comm) {
		
		int[] urns = new int[N];	//число урн
		int GIF = 0;				//среднее по всем урнам
		
		
		for (int i = 0; i < comm.length; i += 3) { //цикл шагает через 3 элемента
			int a = comm[0 + i] - 1;	//+i обеспечивает нужный номер элемента,
			int b = comm[1 + i] - 1;	//а -1 нужен, т.к. элементы цикла начинаются с 0, а не с 1
			int k = comm[2 + i];
			
		for (int j = a; j <= b; j++)  //цикл суммирует от a до b включительно
			urns[j] += k;
		}
		
		for (int i = 0; i < urns.length; i++) {	//считаем сумму всех элементов...
			GIF += urns[i];
		}
		GIF /= urns.length;		//и узнаём среднее
		
		return GIF;
	}

}
