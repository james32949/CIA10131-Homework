package HomeWork6;

public class CalException extends Exception {
	
	public CalException() {
	}
	
	public static void checkZero() {
		try {
				throw new CalException("0的0次方無意義!");	
		} catch (CalException z) {
			System.out.println(z.getMessage());
		}
	}
	
	public static void checkY() {
		try {
				throw new CalException("次方值為負值,結果回傳不為整數");
		} catch(CalException y1) {
			System.out.println(y1.getMessage());
		}
	}
	
	
	public CalException(String message) {
		super(message);
	}
}