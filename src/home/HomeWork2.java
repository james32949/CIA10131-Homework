package home;

public class HomeWork2 {
	public static void main(String[] args) {
		// 第一題
		int i, j, k = 1, sum = 0;
		for (i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		System.out.println("-----------------");

		// 第二題
		for (i = 1; i <= 10; i++) {
			k = k * i;
		}
		System.out.println(k);
		System.out.println("-----------------");

		// 第三題
		i = 1;
		k = 1;
		while (i <= 10) {
			k = k * i;
			i++;
		}
		System.out.println(k);
		System.out.println("-----------------");

		// 第四題
		for (i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println("\n-----------------");

		// 第五題
		k = 0;
		for (i = 1; i <= 49; i++) {
			if (i % 10 != 4 && i / 10 != 4) {
				System.out.print(i + " ");
				k = k + 1;
			}
		}
		System.out.print("\n共有" + k + "個數");

		System.out.println("\n-----------------");

		// 第六題
		for (i = 10; i >= 0; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\n-----------------");

		// 第七題
		int a = 64;
		for (i = 1; i <= 6; i++) {
			a = a + 1;
			for (j = 1; j <= i; j++) {
				System.out.print((char) a + " ");
			}
			System.out.println();
		}
		System.out.println("\n-----------------");

		// 用for+while 做九九乘法
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}

		System.out.println("\n-----------------");

		// 用for+do while 做九九乘法
		for (i = 1; i <= 9; i++) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}

		System.out.println("\n-----------------");
		// 用while+do while 做九九乘法

		i = 1;
		while (i <= 9) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}

}
