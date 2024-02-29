package HomeWork7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HomeWork7_4 implements Serializable {

	public static void main(String[] args) {
		Dog dog1 = new Dog("jack");
		Dog dog2 = new Dog("jason");
		Cat cat1 = new Cat("jessica");
		Cat cat2 = new Cat("jenny");

		File newFile = new File("D://data");
		newFile.mkdirs();

		File output = new File("D://data//Object.ser");

		try {
			FileOutputStream fos = new FileOutputStream(output);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dog1);
			oos.writeObject(dog2);
			oos.writeObject(cat1);
			oos.writeObject(cat2);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
