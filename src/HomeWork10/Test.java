package HomeWork10;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		String regex2 = "^[1-3]$";
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		
		System.out.println(i.matches(regex2));
			
		
	}

}
