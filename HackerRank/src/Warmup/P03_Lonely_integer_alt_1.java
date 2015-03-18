package Warmup;

import java.util.Scanner;

public class P03_Lonely_integer_alt_1 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter array length: ");
		int arraylength = in.nextInt();
		
		System.out.print("Fill the array: ");
		StringBuilder input = new StringBuilder();
		
		for(int i = 0; i < arraylength; i++){
			input.append(in.next());
		}
		input.trimToSize();
			
		System.out.println(input.toString());
		
	
	}

}
