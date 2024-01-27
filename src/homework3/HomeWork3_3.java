package homework3;

import java.util.Scanner;

public class HomeWork3_3 {
	public static void main(String[] arge) {
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入0~9之間的數");
		k = sc.nextInt();

		j = 0;
		for (i = 1; i <= 49; i++) {
			if (i % 10 != k && i / 10 != k) {
				System.out.print(i + " ");
				j++;
			}
		}
		System.out.print("\n共有" + j + "個數");

		System.out.println("\n-----------------");

	}
}
