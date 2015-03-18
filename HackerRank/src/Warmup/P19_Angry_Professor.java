package Warmup;

import java.util.Scanner;

public class P19_Angry_Professor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of tests: ");
		int T = in.nextInt();
		
		String[] classroom = new String[T];
		String[] students = new String[T];
		System.out.println("Enter N and K and students times:");
		in.nextLine();
		for (int i = 0; i < T; i++) {
			classroom[i] = new String(in.nextLine());
			students[i] = new String(in.nextLine());
		}
		
		
		toBeOrNotToBe(classroom, students);
		
		in.close();

	}

	private static void toBeOrNotToBe(String[] cls, String[] stud) {
		
		for (int i = 0; i < cls.length; i++) {
			
			Scanner in = new Scanner(cls[i]);
			
			int come_in = Integer.valueOf(in.next());
			int edge = Integer.valueOf(in.next());
			int counterOfstud = 0;
			
			Scanner in2 = new Scanner(stud[i]);
			for (int j = 0; j < come_in; j++) {
				int tmp = Integer.valueOf(in2.next());
				if ( tmp <= 0){
					++counterOfstud;
				}
			}
			
			if (counterOfstud >= edge){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
		
			in2.close();
			in.close();
		
		}
		
	}

}
