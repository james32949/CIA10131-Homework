package HomeWork4;

public class HoemWork4_3 {
	public static void main(String[] arge) {
		String[] planet = { "mercury", "venus", "earth", "jupiter", "saturn", "uranus", "neptune" };
//		System.out.println(planet[0]);	
		int j = 0;
		for (int i = 0; i < planet.length; i++) {
			j = j + count(planet[i]);
		}
		System.out.print(j);
	}

	public static int count(String pname) {
		char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';
		int h = 0;
		for (int k = 0; k < pname.length(); k++) {

			if (pname.charAt(k) == a || 
				pname.charAt(k) == e || 
				pname.charAt(k) == i || 
				pname.charAt(k) == o || 
				pname.charAt(k) == u) 
			{
				h = h + 1;
			}
		}
		return h;
	}

}
