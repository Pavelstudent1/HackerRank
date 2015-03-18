package Warmup;
import java.util.Arrays;
import java.util.Scanner;


public class P10_Game_of_Thrones_I {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String s = new String(in.next());
		
		//System.out.println(isPalindrome(s));
		System.out.println(isPalindromeFast(s));
		
		
		in.close();
	}

	private static String isPalindrome(String s) {
	
	char[] tmpc = s.toCharArray();
	Arrays.sort(tmpc);

	StringBuilder tmps = new StringBuilder();
	for (int i = 0; i < tmpc.length; i++) {
		tmps.append(tmpc[i]);
	}
	
	
	char c = tmps.charAt(0);
	boolean deletion = false;
	for (int i = 1; i < tmps.length();) {
		if (c == tmps.charAt(i)){
			tmps.deleteCharAt(i);
			deletion = true;
		}
		else{
			c = tmps.charAt(i);
			++i;
		}
	}
	
	if ((tmps.charAt(0) != tmps.charAt(1)) && deletion) 
		return "Yes!";
	else 
		return "No!";
	}

	
	private static String isPalindromeFast(String s)
	{
		char[] c = s.toCharArray();
		Arrays.sort(c);
		
		return (c[0] == c[1] ? "Yes!" : "No!");
	}
	
	
}
