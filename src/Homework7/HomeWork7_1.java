package HomeWork7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork7_1 {
	public static void main(String args[]) {

		File Sample = new File("C:\\CIA101_Workspace\\Sample.txt");
		long xxx = Sample.length();
		int yyy = 0;
		int i;
		try {
			FileReader y = new FileReader("C:\\CIA101_Workspace\\Sample.txt");
			while ((i = y.read()) != -1)
				yyy = yyy + 1;
			y.close();

		} catch (IOException e) {
		}

		System.out.println("Sample.txt檔案共有" + xxx + "個位元組，" +yyy+ "個字元，zzz列資料");

	}
}
