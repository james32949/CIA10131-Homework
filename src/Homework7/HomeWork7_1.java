package HomeWork7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork7_1 {
	public static void main(String args[]) {

		File Sample = new File("C:\\CIA101_Workspace\\Sample.txt");

		long xxx = Sample.length();
		long yyy = 0;
		String zzz;
		int i;
		int j=0;
		try {
			FileReader y = new FileReader("C:\\CIA101_Workspace\\Sample.txt");
			while ((i = y.read()) != -1)
				yyy = yyy + 1;
			y.close();

			FileReader fr = new FileReader("C:\\CIA101_Workspace\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while ((zzz = br.readLine()) != null) {
				j = j + 1;
			}

		} catch (IOException e) {
		}

		System.out.println("Sample.txt檔案共有" + xxx + "個位元組，" + yyy + "個字元，"+j+"列資料");

	}
}
