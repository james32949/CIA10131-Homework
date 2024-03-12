package HomeWork10;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork10_3 {

	public static void main(String args[]) {
		String regex = "^\\d{4}([0][1-9]|[1][0-2]){1}([0-2][1-9]|[3][1-2]){1}$";
		String regex2 = "^[1-3]$";
		Scanner scn = new Scanner(System.in);
		SimpleDateFormat inputDate = new SimpleDateFormat("yyyyMMdd");
//		SimpleDateFormat outputDate = new SimpleDateFormat("yyyy/MM/dd");

		for (;;) {
			System.out.println("請輸入日期 格式為YYYYMMDD 例:20121224");
			String tel = scn.next();

			if (!tel.matches(regex)) {
				System.out.print("輸入格式錯誤!!");
				continue;
			} else {
				System.out.println("請選擇格式\n1.年月日\n2.月日年\n3.日月年");
				Date date;
				B: while (true) {

					System.out.println("請輸入1~3");
					String i = scn.next();

					if (i.matches(regex2)) {

						switch (Integer.parseInt(i)) {

						case 1:
//						System.out.println(1);
							SimpleDateFormat outputDate1 = new SimpleDateFormat("yyyy/MM/dd");
							try {
								date = inputDate.parse(tel);
								System.out.print(outputDate1.format(date));
							} catch (ParseException e) {
								e.printStackTrace();
							}
							break;

						case 2:
//						System.out.println(2);
							SimpleDateFormat outputDate2 = new SimpleDateFormat("MM/dd/yyyy");
							try {
								date = inputDate.parse(tel);
								System.out.print(outputDate2.format(date));
							} catch (ParseException e) {
								e.printStackTrace();
							}
							break;

						case 3:
//						System.out.println(3);
							SimpleDateFormat outputDate3 = new SimpleDateFormat("dd/MM/yyyy");
							try {
								date = inputDate.parse(tel);
								System.out.print(outputDate3.format(date));
							} catch (ParseException e) {
								e.printStackTrace();
							}
							break;

						default:
							System.out.print("輸入錯誤!!!!!");
							continue B;
						}
						break;
					}else {
						System.out.print("輸入錯誤!!");
						continue;
					}
				}
			}
			break;
		}

	}
}
