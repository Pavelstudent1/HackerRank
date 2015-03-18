package Warmup;

import java.util.Scanner;

public class P08_Love_Letter_Mystery {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int arlen = in.nextInt();
		
		StringBuilder[] S = new StringBuilder[arlen];
		for(int i = 0; i < S.length; i++)
			S[i] = new StringBuilder(in.next());
		
		
		for(StringBuilder i : S)
			makepalindrom(i);
		
		in.close();
		
		
	}
	
	private static void makepalindrom(StringBuilder S)
	{
	
			int maxstep = S.length() / 2; //максимально необходимое число шагов по строке
			int repcount = 0;			  //общее количество смен символов
			
//			Просмотр ведётся с обоих концов строки:
//			s - индекс первого символа. Этот символ задаёт последовательность.
//			f - индекс оследнего символа. Этот символ приводится к задающему.
//			на каждом шаге s увеличивается, а f уменьшается
			for(int s = 0, f = S.length() - 1; maxstep > 0; s++, f--){
				
				while(S.charAt(s) != S.charAt(f)){				//символы не одинаковы?
					char c = 										//приводимый символ
						(char) (S.charAt(f) > S.charAt(s) ?			//если больше задающего, то -1,
								S.charAt(f) - 1 : S.charAt(f) + 1);	//если мешьне - +1
					S.setCharAt(f, c);		//смена приводимого символа
					++repcount;				//увеличение счётчика смен
				}
			--maxstep;		//шаг выполнен
			
			}
			
		System.out.println(repcount + " ->> " + S);
	}

}
