package HomeWork10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class HomeWork10_2 {

	public static void main(String args[]) {
//		String regex1 = "^(\\d*)\\S$";
		String regex1 = "^(\\d+\\.\\d+)|(\\d+)$";
		String regex2 = "^[1-3]$";
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("請輸入任意長度的數字");
			String num1 = sc.nextLine();

			if (num1.matches(regex1)) {
//				System.out.println("OK!!");
//				System.out.println(num);

				while (true) {
					System.out.println("請輸入1~3選擇格式\n1.千分位\n2.百分比\n3.科學記號");
					String num2 = sc.next();

					if (num2.matches(regex2)) {

						switch (Integer.parseInt(num2)) {
						case 1:
							System.out.print("千分位:");
							Format dfm1 = new DecimalFormat("#,###.00");
							System.out.println(dfm1.format(Double.parseDouble(num1)));
							break;
						case 2:
							System.out.print("百分比:");
							Format dfm2 = new DecimalFormat("#%");
							System.out.println(dfm2.format(Double.parseDouble(num1)));
							break;
						case 3:
							System.out.print("科學記號:");
							System.out.format("%e",Double.parseDouble(num1));
							break;
						default:
							System.out.println("輸入錯誤!!");
							continue;

						}
					} else {
						System.out.print("輸入錯誤!");
						continue;
					}
					break;
				}
				break;

			} else {
				System.out.println("輸入錯誤!!只能有數字且不能有空格");
				continue;
			}
		}
	}

}