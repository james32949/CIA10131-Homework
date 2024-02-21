package HomeWork6;

import java.awt.Checkbox;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest extends CalException {
	public static void main(String args[]) throws CalException {
		int x = 0;
		int y = 0;
		Scanner sc = new Scanner(System.in);
		Calculator e = new Calculator();

		try {
			System.out.println("請輸入x的值");
			x = sc.nextInt();
			System.out.println("請輸入y的值");
			y = sc.nextInt();

			if (x == 0 && y == 0) {
				try {
					throw new CalException();
				} catch (CalException ex) {
					ex.checkZero();
				}

			} else if (y < 0) {
				try {
					throw new CalException();
				} catch (CalException ex) {
					ex.checkY();
				}

			} else {
				System.out.println(x+"的"+y+"次方為"+e.powerXY(x, y));
			}

		} catch (InputMismatchException ex) {
			System.out.println("輸入格式錯誤");
		}
	}
}