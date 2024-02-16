package HomeWork5;

public class HomeWork5_5 {
	public static void main(String args[]) {
		genAuthCode();

	}

	public static void genAuthCode() {
		int a;
		int count = 0;
		System.out.print("本次隨機驗證碼為:");
		while (count != 8) {
			a = (int) ((Math.random() * 123) + 1);
			if ((a > 47 && a < 58) || (a > 64 && a < 91) || (a > 96 && a < 123)) {
				System.out.print((char) a);
				count = count + 1;
			}
		}
	}
}
