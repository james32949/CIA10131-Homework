package HomeWork8;

import java.util.Objects;

public class Train implements Comparable<Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public void setterTrain(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public void getterTrain() {
		System.out.println(this.number + " " + this.type + " " + this.start + " " + this.dest + " " + this.price + " ");

	}

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getStart() {
		return start;
	}

	public String getDest() {
		return dest;
	}

	public double getPrice() {
		return price;
	}

	public static void main(String args[]) {
		Train Puyuma_202 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train LocalTrain_1254 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train LimitedExpress_118 = new Train(118, "自強", "高雄", "台北", 500);
		Train LocalTrain_1288 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train LimitedExpress_122 = new Train(122, "自強", "台中", "花蓮", 600);
		Train LocalTrain_1222 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train LocalTrain_1254_2 = new Train(1254, "區間", "屏東", "基隆", 700);

		// 測試修改取得
//		Puyuma_202.getterTrain();
//		Puyuma_202.setterTrain(666, "區間特快", "天堂", "地獄", 666);
//		System.out.println("===============================================");
//		Puyuma_202.getterTrain();

	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	

	@Override
	//Number大小定義
	public int compareTo(Train th) {
		if (this.number > th.number) {
			return -1;
		} else {
			return 1;
		}
	}

}
