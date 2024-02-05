package HomeWork4;

import java.util.Scanner;

public class HomeWork4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int sum = 0;
		int[] month = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("請輸入年:");
		a[0] = sc.nextInt();

		System.out.println("請輸入月:");
		a[1] = sc.nextInt();
		if (a[1] < 0 || a[1] > 13) {
			System.out.println("請重新輸入");
			return;
		}

		System.out.println("請輸入日:");
		a[2] = sc.nextInt();
		if ((a[1] == 2) && (a[0] % 4 != 0 && a[0] % 100 == 0) || (a[0] % 400 != 0) && (a[2] > 28)) {
			System.out.println("請重新輸入");
			return;
		} else {
			if (a[2] > month[a[1]]) {
				System.out.println("請重新輸入");
				return;
			}
		}
		
		for (int k = 0; k < a[1]; k++) {
			sum = sum + month[k];
		}
		sum = sum + a[2];

		if ((a[0] % 4 == 0 && a[0] % 100 != 0) || (a[0] % 400 == 0)) {
			System.out.println("輸入日期為該年的第" + sum + "天");
		} else {
			if (a[1] <= 2) {
				System.out.println("輸入日期為該年的第" + sum + "天");
			} else {
				sum = sum - 1;
				System.out.println("輸入日期為該年的第" + sum + "天");
			}

		}
	}
}
