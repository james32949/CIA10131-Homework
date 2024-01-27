package homework3;

import java.util.Scanner;

public class HomeWork3_2 {
	public static void main(String[] arge) {
		int i, j;
		i = (int) (Math.random() * 10) + 1;
//		System.out.println(i);

		Scanner sc = new Scanner(System.in);
//		System.out.println("請出入0~9之間的數");
//		j = sc.nextInt();
//		System.out.println(j);

		while (true) {
			System.out.println("請輸入0~9之間的數");
			j = sc.nextInt();
			
			if (i != j) {
				System.out.println("猜錯了");
			} else {
				if (i == j) {
					System.out.println("正確");
					break;
				}
			}
		}
	}
}