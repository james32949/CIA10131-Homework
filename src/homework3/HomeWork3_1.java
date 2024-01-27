package homework3;

import java.util.Scanner;

public class HomeWork3_1 {
	public static void main(String[] arge) {
		HomeWork3_1 sl = new HomeWork3_1();
		int data[] = new int[3];

		for (int i = 0; i < data.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("input a number");
			data[i] = sc.nextInt();
		}
//		System.out.println(data[0]+" "+data[1]+" "+data[2]);
		if (data[0] == data[1] && data[0] == data[2] && data[1] == data[2]) {
			System.out.println("為正三角形");
		} else {
			if (data[0] == data[1] && data[0] + data[1] > data[2]) {
				System.out.println("等腰三角形");
			} else {
				if (data[1] == data[2] && data[1] + data[2] > data[0]) {
					System.out.println("等腰三角形");
				} else {
					if (data[2] == data[0] && data[2] + data[0] > data[1]) {
						System.out.println("等腰三角形");
					} else {
						if (data[0] + data[1] <= data[2] || data[1] + data[2] <= data[0]
								|| data[2] + data[0] <= data[1]) {
							System.out.println("不是三角形");
						} else {
							System.out.println("其他三角形");
						}
					}
				}
			}
		}
	}
}