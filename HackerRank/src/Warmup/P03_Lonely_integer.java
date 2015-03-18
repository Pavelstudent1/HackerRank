package Warmup;

import java.util.Scanner;

public class P03_Lonely_integer {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter array length: ");
		int arraylength = in.nextInt();
		int[] A = new int[arraylength];
		
		System.out.print("Fill the array: ");
		
		for(int i = 0; i < A.length; i++) 
			A[i] = in.nextInt();
		
		//поочерёдно проверяем каждый элемент массива 
		for(int i = 0; i < A.length; i++){
			
			int count = 0;	//счётчик повторений
			
			for(int j = 0; j < A.length; j++)
				if (i != j && A[i] == A[j]) ++count; //если позиции элементов не совпадают(т.е. элемент не сравнивается сам с собой)
			 										 //и значения элементов равны - счётчик увеличивается
			
			if (count == 0) //если за проход счётчик не равен 0 - были совпадения
				System.out.println(A[i] + " is unique number!"); 
		}
		
		
		
	}

}
