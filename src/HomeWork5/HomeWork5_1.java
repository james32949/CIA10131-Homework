package HomeWork5;

import java.util.Scanner;

public class HomeWork5_1 {
	public static void main(String args[]) {
		int x, y;
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入 width");
		x = sc.nextInt();
		System.out.println("請輸入 height");
		y = sc.nextInt();

		starSquare(x, y);

	}

	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width - 1; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
