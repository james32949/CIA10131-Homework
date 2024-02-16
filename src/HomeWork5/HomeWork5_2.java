package HomeWork5;

public class HomeWork5_2 {
	public static void main(String args[]) {
		randAvg();
	}

	public static void randAvg() {
		int a[]=new int[10];
		int sum=0;
		System.out.println("本次亂數結果為:");
		for (int i = 0; i < 10; i++) {
			a[i] = (int) ((Math.random() * 100) + 1);
			System.out.print(a[i]+" ");
			sum=sum+a[i];			
		}
		System.out.println("\n平均值為"+(sum/10));
	}
}
