package HomeWork7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork7_3 {
	public static void main(String args[]) {
		try {
			coyFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void coyFile() throws IOException {
		File input = new File("..//Sample.txt");
		File output = new File("OutData.txt");

		FileReader in = new FileReader(input);
		FileWriter out = new FileWriter(output);
		int i;

		while ((i = in.read()) != -1) {
			out.write(i);
			System.out.print((char) i);
			System.out.flush();
		}

		in.close();
		out.close();
	}
}