package HomeWork10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork10_2 {
	double i = 0;

	public void setI(double i) {
		this.i = i;
	}

	public double getI() {
		return i;
	}

	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		double i = 0;
		System.out.println("請輸入數字");
		try {
			i = sc.nextDouble();
			setI(i);
		} catch (InputMismatchException e) {
			System.out.print("輸入格式不正確 ");
			inputNumber();
		}
//		System.out.println(i);

	}

	public static void select(double i) {
		System.out.println("請輸入1~3選擇表示法 \n1:千分位 \n2:百分比\n3:科學記號");
		Scanner sc = new Scanner(System.in);
		int j;

		while (true) {
			j = sc.nextInt();
			switch (j) {
			case 1:				
				Format dfm1 = new DecimalFormat("#,###.00");
				System.out.println(dfm1.format(i));
				break;
			case 2:
//				System.out.format("%%", i);		
				Format dfm2 = new DecimalFormat("0.##%");
				System.out.println(dfm2.format(i));
				break;
			case 3:
				System.out.format("%e", i);					
//				Format dfm3 = new DecimalFormat("0.###E0");
//				System.out.println(dfm3.format(i));
				break;
			default:
				System.out.println("請輸入1~3");
				continue;
			}
			break;
		}

	}

	public static void main(String args[]) {
		HomeWork10_2 obj = new HomeWork10_2();
		obj.inputNumber();
//		System.out.println(js.getI());
		select(obj.getI());


	}

}