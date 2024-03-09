package HomeWork10;

public class HomeWork10_1 {
	public static void main(String args[]) {

		for (int i = 0; i < 5; i++) {
			int r = (int) ((Math.random() * 100) + 1);
			if (isPrime(r)) {
				System.out.println(r + ":為質數");
			} else {
				System.out.println(r + ":不為質數");
			}
		}
		

		
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return true;
		} else {
			if (n > 2) {
				for (int i = 2; i < n; i++) {
					if (n % i == 0) {
						return false;
					}
				}
				return true;
			} else {
				return n == 2;
			}
		}
	}
}