package HomeWork4;

public class HomeWork4_6 {


	public static void main(String[] args) {
		int[][] x = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] num = new int[8];
		int[] max = new int[6];
		int k = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
//				System.out.print(x[i][j] + " ");
				for (int l = 0; l < x[i][j]; l++) {
					if (k < x[i][j]) {
						k++;
					}
				}
			}
//			System.out.print(k + " ");
			max[i] = k;
			k = 0;
		}
//		System.out.println("\n----------------------");

//		for (int i = 0; i < max.length; i++) {
//			System.out.print(max[i] + " ");
//		}

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max[i] == x[i][j]) {
					num[j]++;
				}
			}
		}
//		System.out.println("\n----------------------");
		for (int i = 0; i < num.length; i++) {
			System.out.println("第"+(i+1)+"號考了"+num[i]+"次最高分");
		}
		
	}
}
