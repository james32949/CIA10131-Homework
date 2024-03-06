package HomeWork9;

class bank {
	private int money = 0;

	synchronized public void saveMoney(int money) {
		if (this.money > 3000) {
			System.out.println("存款超過三千 不在存款");
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
		if (this.money < 2000) {
			System.out.println("存款餘額不足 請求媽媽存款");
			try {
				wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.money = this.money - money;
		System.out.println("雄大提了" + money);
		System.out.println("目前帳戶餘額:" + this.money);
		System.out.println("=====================");
		notify();
	}

	public int getMoney() {
		return money;
	}
}

class mom extends Thread {
	bank account;

	public mom(bank account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			account.saveMoney(2000);
		}
	}
}

class son extends Thread {
	bank account;

	public son(bank account) {
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

		bank account = new bank();
		System.out.println("目前帳戶餘額:" + account.getMoney());
		son son = new son(account);
		mom mom = new mom(account);
		mom.start();
		son.start();
		
	}
}
