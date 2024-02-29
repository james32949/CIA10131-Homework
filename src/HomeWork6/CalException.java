package HomeWork6;

public class CalException extends Exception {
	public class checkZero extends CalException{}
	public class checkY extends checkZero{}
	

	public CalException() {
	}

	public static int checkZero(int x, int y)throws checkY{
		if (x == 0 && y == 0) {
			try {
				throw new CalException("0的0次方無意義!");
			} catch (CalException z) {
				System.out.println(z.getMessage());
			}
		}
		return y;
	}

	public static void checkY(int y) {
		if (y < 0) {
			try {
				throw new CalException("次方值為負值,結果回傳不為整數");
			} catch (CalException y1) {
				System.out.println(y1.getMessage());
			}
		}
	}

	public CalException(String message) {
		super(message);
	}
}