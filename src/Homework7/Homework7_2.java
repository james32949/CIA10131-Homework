package HomeWork7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.io.*;

public class Homework7_2 {

	public static void main(String args[]) throws IOException {

		Set set = new HashSet();
		
		while (set.size() != 10) {
			int r = (int) (Math.random() * 1000) + 1;
			set.add(r);
		}

		Iterator it = set.iterator();
				
		try {
			FileWriter fw = new FileWriter("DataTest.txt",true);

//			BufferedWriter bw = new BufferedWriter(fw);

//			PrintWriter pw = new PrintWriter(bw);
			
			while (it.hasNext()) {
				//System.out.println(it.next());
				fw.write(Integer.toString((int) it.next())+" ");
			}

			
//			pw.close();
//			bw.close();
			fw.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	
	}
}
