package HomeWork7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class HomeWork7_5 implements Serializable{

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("D://data//Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);


		try {
			while (true) {
				((Animal)ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	}

}
