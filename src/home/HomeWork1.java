package home;

public class HomeWork1 {
	public static void main(String[] args) {
		// 第一題
		int a = 12, b = 6;
		int sum = a + b;
		System.out.println("和=" + sum);
		System.out.println("積=" + a * b);

		// 第二題
		int egg = 200;
		System.out.println(egg / 12 + "打" + egg % 12 + "顆");

		// 第三題
		int sec = 256559;
		int min, hr, day;
		min = sec / 60;
		hr = min / 60;
		day = hr / 24;
		System.out.println(day + "天" + hr % 24 + "小時" + min % 60 + "分鐘" + sec % 60 + "秒");

		// 第四題
		final double PI = 3.1415;
		int r = 5;
		double area, perimeter;
		area = PI * r * r;
		perimeter = 2 * r * PI;
		System.out.printf("面積=%.2f", area);
		System.out.printf(" 周長=%.2f", perimeter);

		// 第五題
		System.out.print(" \n");
//		FV ＝ PV×（1 ＋ R）n 次方FV 為期末本利和，
//		PV 為期初本金，
//		R 為每期利率，
//		n 為期數
//		也就是--期末本利和＝期初本金×（1＋利率）期數次方。
		int PV = 1500000;
		double R = 0.02;
		int n = 10;
		double FV = PV * Math.pow((1 + R), n);
		System.out.printf("共有%.2f", FV);

		System.out.print("\n");
		// 第六題
		System.out.println(5 + 5); // 資料類別都是為int 加號功能為數字相加所以顯示結果為10
		System.out.println(5 + '5'); // 單引號內資料類別為char JAVA會去對應 Unicode 中相對的字元 加號功能為串接相加所以顯示結果為58									 
		System.out.println(5 + "5"); // 雙引號內資料類別為staring 加號功能為串接相加所以顯示結果為55
	}
}
