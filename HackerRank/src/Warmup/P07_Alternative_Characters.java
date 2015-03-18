package Warmup;

import java.util.Scanner;

public class P07_Alternative_Characters {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int alength;
		do{
			alength = in.nextInt();
		}while(alength > 10);
		
		StringBuilder[] S = new StringBuilder[alength];
		for(int i = 0; i < S.length; i++)
			S[i] = new StringBuilder(in.next());
		
		CharDeleter(S);
		in.close();
	}
	
	private static void CharDeleter(StringBuilder[] S)
	{
		for(int i = 0; i < S.length; i++){
			int delcount = 0;					//счётчик удалений
			char flag = S[i].charAt(0);			//первый символ строки - задающий
			for(int j = 1; j < S[i].length();){	//смотрим строку, начиная с второго символа...
				
				if (flag == S[i].charAt(j)){	//совпадает с задающим?
					S[i].deleteCharAt(j);		//если да, то символ удалить,
					++delcount;					//а счётчик увеличить
				}
				else{							//не совпадает с задающим
					flag = S[i].charAt(j);		//поменять задающий символ
					++j;						//сместить просмотр символа на следующее место
				}
			}

		System.out.println(S[i] + " ->> " + delcount);
		}
	}
}
