package HomeWork8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HomeWork8_1 {
	public static void main(String args[]) {
		Collection<Object> obj = new ArrayList<>();
		obj.add(new Integer(100));
		obj.add(new Double(3.14));
		obj.add(new Long(21L));
		obj.add(new Short("100"));
		obj.add(new Double(5.1));
		obj.add(new String("Kitty"));
		obj.add(new Integer(100));
		obj.add("Snoopy");
		obj.add(new BigInteger("1000"));

		// 使用Inerator印出所有元素
		Iterator objs = obj.iterator();
		while (objs.hasNext())
			System.out.print(objs.next() + " ");

		// 使用for迴圈印出所有元素
		System.out.println("\n===============================================1");
		for (int i = 0; i < obj.size(); i++) {
			Object o = ((ArrayList<Object>) obj).get(i);
			System.out.print(o + " ");
		}

		// 使用foreach印出所有元素
		System.out.println("\n===============================================2");
		for (Object xx : obj) {
			System.out.print(xx + " ");
		}
		// 移除非java.lang.Number物件;
		for (int i = 0; i < obj.size(); i++) {
			if (((ArrayList<Object>) obj).get(i) instanceof Number) {

			} else {
				Object o = ((ArrayList<Object>) obj).remove(i);
			}
		}

		// 再次印出
		System.out.println("\n===============================================3");
		for (Object xx : obj)
			System.out.print(xx + " ");

	}
}
