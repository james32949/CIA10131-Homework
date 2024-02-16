package HomeWork5;

import java.util.Arrays;

public class HomeWork5_3 {

	public static void main(String args[]) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		HomeWork5_3 w = new HomeWork5_3();

		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}

	public static int maxElement(int[][] x) {

		int max[] = new int[x.length];

		for (int i = 0; i < x[0].length - 1; i++) {
			Arrays.sort(x[i]);
			max[i] = x[i][x[i].length - 1];
		}

		Arrays.sort(max);
		return max[max.length - 1];
	}

	public static double maxElement(double x[][]) {

		double max[] = new double[x.length];

		for (int i = 0; i < x[0].length - 1; i++) {
			Arrays.sort(x[i]);
			max[i] = x[i][x[i].length - 1];
		}

		Arrays.sort(max);
		return max[max.length - 1];

	}
}
