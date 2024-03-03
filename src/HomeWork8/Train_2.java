package HomeWork8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Train_2 {

	public static void main(String[] args) {
		Set<Train> train = new TreeSet<Train>();

		Train Puyuma_202 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train LocalTrain_1254 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train LimitedExpress_118 = new Train(118, "自強", "高雄", "台北", 500);
		Train LocalTrain_1288 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train LimitedExpress_122 = new Train(122, "自強", "台中", "花蓮", 600);
		Train LocalTrain_1222 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train LocalTrain_1254_2 = new Train(1254, "區間", "屏東", "基隆", 700);

		train.add(Puyuma_202);
		train.add(LocalTrain_1254);
		train.add(LimitedExpress_118);
		train.add(LocalTrain_1288);
		train.add(LimitedExpress_122);
		train.add(LocalTrain_1222);
		train.add(LocalTrain_1254_2);

		// 用foreach取值
		for (Train xxx : train) {
			System.out.println(xxx.getNumber() + " " + xxx.getType() + " " + xxx.getStart() + " " + xxx.getDest() + " "
					+ xxx.getPrice());
		}

		// 用Iterator 取值
		System.out.println("===============================================");
		Iterator trains = train.iterator();
		while (trains.hasNext()) {
			Object objs = trains.next();
			((Train) objs).getterTrain();
		}
	}

}
