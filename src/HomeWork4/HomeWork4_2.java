package HomeWork4;

import java.util.Scanner;

public class HomeWork4_2 {

	public static void main(String[] args) {
		String i;
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入字串");
		i = sc.nextLine();
//		System.out.println(i);
		for (int j = i.length()-1; j >= 0; j--) {
			System.out.print(i.charAt(j));
		}		
	}
}