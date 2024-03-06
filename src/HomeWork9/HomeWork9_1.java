package HomeWork9;

public class HomeWork9_1 implements Runnable {
	int counter = 1;

	public HomeWork9_1() {
	}

	public static void main(String[] args) {
		System.out.println("-----大胃王比賽即將開始-----");
		HomeWork9_1 r1 = new HomeWork9_1();
		Thread t1 = new Thread(r1, "饅頭人");

		HomeWork9_1 r2 = new HomeWork9_1();
		Thread t2 = new Thread(r2, "詹姆士");

		t1.start();
		t2.start();
		
		//等待執行緒
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if ((t1.isAlive() == false) && (t2.isAlive() == false)) {
			System.out.println("-----大胃王比賽結束-----");
		}

	}

	public void run() {

//		int randomNum=((int)(Math.random()*2501)+500);
		while (counter <= 10) {
//			System.out.println(counter);

			System.out.println(Thread.currentThread().getName() + "吃第" + counter + "碗飯");
			counter++;

			try {
				Thread.sleep((int) (Math.random() * 2501) + 500);
			} catch (Exception e) {

			}
			
		}
		System.out.println(Thread.currentThread().getName() + "吃完了!!");	
	}

}
