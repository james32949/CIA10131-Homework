package HomeWork4;

public class HomeWork4_1 {

	public static void main(String[] args) {
		int sum = 0;
		int[] i = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		for (int j = 0; j < i.length; j++) {

			sum = sum + i[j];
		}
//		System.out.println(sum);

		double agv = sum / i.length;
		System.out.println(agv);
	}
}
