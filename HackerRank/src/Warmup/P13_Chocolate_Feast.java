package Warmup;

import java.util.Scanner;

public class P13_Chocolate_Feast {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter nubmer of test cases: ");
		int T = in.nextInt();
		
		int[] tests = new int[T*3];
		System.out.println("Enter T lines in form \"N C M\"");
		for (int i = 0; i < tests.length;) {
			tests[i++] = in.nextInt();
	 		tests[i++] = in.nextInt();
	 		tests[i++] = in.nextInt();
		}
	 		
	 	numberOfChocolate(tests);
		
		in.close();
	}

	private static void numberOfChocolate(int[] tst) {
		
		int bonus_choc = 0,
			wraps = 0,
			chocos_all = 0;
		
		for (int i = 0; i < tst.length; i += 3) {
			
			wraps = chocos_all = tst[0 + i] / tst[1 + i]; //получаем сколько шоколадок(т.е. будущие же фантики) 
														  //можно купить сходу
			
			bonus_choc = wraps / tst[2 + i];	//сколько шоколадок идут в бонус за фантики
			chocos_all += bonus_choc;			//увеличиваем общее число шоколадок на бонус
			wraps -= tst[2 + i]*bonus_choc;		//убираем из фантиков бонус
			
			wraps += bonus_choc;	//но ведь бонусные шоколадки тоже дают фантики
			
			chocos_all += wraps / tst[2 + i]; //наконец, к общему числу добавляем шоколадки, 
											  //если фантики позволяют
			
			System.out.println(chocos_all);
		}
		
		
		
	}
}
