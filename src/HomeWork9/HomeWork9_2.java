package HomeWork9;

class Bank {
	private int money = 0;

	synchronized public void saveMoney(int money) {
		while (this.money > 3000) {
			System.out.println("媽媽看見存款超過三千 暫停存款");
			System.out.println("雄大被告知帳戶已經有錢");

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.money = this.money + money;
		System.out.println("媽媽存了:" + money);
		System.out.println("目前帳戶餘額:" + this.money);

		System.out.println("=====================");
		notify();
	}

	synchronized public void takeMoney(int money) {

		while (this.money < 1000) {
			System.out.println("存款餘額不足");
			try {
				wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.money = this.money - money;
		System.out.println("雄大提了" + money);
		System.out.println("目前帳戶餘額:" + this.money);
		if (this.money <= 1000) {
			System.out.println("雄大看見餘額不足2000請求媽媽存款");
			notify();
		}

		System.out.println("=====================");
		notify();
	}

	public int getMoney() {
		return money;
	}
}

class Mom extends Thread {
	Bank account;

	public Mom(Bank account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			account.saveMoney(2000);
		}
	}
}

class Son extends Thread {
	Bank account;

	public Son(Bank account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			account.takeMoney(1000);
		}
	}
}

public class HomeWork9_2 {
	public static void main(String[] arge) {

		Bank account = new Bank();
		System.out.println("目前帳戶餘額:" + account.getMoney());
		Son son = new Son(account);
		Mom mom = new Mom(account);
		mom.start();
		son.start();

	}
}
