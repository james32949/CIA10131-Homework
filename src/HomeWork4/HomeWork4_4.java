package HomeWork4;

import java.util.Scanner;

public class HomeWork4_4 {

	public static void main(String[] args) {
		int x[][] = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入借款金額");
		i = sc.nextInt();
		System.out.print("可以借款的員工編號:");
		int k = 0;
		for (int j = 0; j < x[1].length; j++) {
			if (i <= x[1][j]) {
				System.out.print(x[0][j]+" ");
				k=k+1;
			}
		}
		System.out.println("共"+ k +"人");
	}
}