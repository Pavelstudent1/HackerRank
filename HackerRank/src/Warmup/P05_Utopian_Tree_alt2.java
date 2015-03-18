package Warmup;

import java.util.Scanner;

public class P05_Utopian_Tree_alt2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int arraylength = in.nextInt();
		
		int[] A = new int[arraylength];
		for(int i = 0; i < A.length; i++){
			A[i] = in.nextInt();
		}
		
		//calculateWithIF(A);
		calculateFast(A);
		
		in.close();
	}
	
	//вычисление через анализ значения, отвечающего за число циклов роста
	public static void calculateWithIF(int[] A)
	{
		for(int i = 0; i < A.length; i++){ //пробегаем все заданные циклы роста
			
		int treelength = 1; //высота дерева по умолчанию
		for(int j = 1; j <= A[i]; j++){	//каждый шаг - цикл роста, предел циклов задан пользователем
			if (j % 2 != 0) 			
				treelength *= 2;		//если нечётно - умножаем высоту дерева на 2
			else 
				treelength += 1;		//если чётно - добавляем к росту 1
		}
			
		System.out.println(treelength);
		}
	}
	
	//быстрый метод вычисления по готовой формуле.
	//формула: (2 << ((cycle/2) + i)) - j, где i = 0, если cycle чётно и 1, если cycle нечётно;
	//										   j = 1, если cycle чётно и 2, если нечётно.
	public static void calculateFast(int[] A)
	{
		for(int i = 0; i < A.length; i++){
			if (A[i] % 2 == 0) 
				System.out.println((2 << (A[i]/2)) - 1);
			else
				System.out.println((2 << (A[i]/2) + 1) - 2);
		}
		
		//Извращение в одну формулу: 
		//(2 << ((i / 2) + (i % 2 == 0 ? 0 : 1)) - (i % 2 == 0 ? 1 : 2)) 
	}
}

