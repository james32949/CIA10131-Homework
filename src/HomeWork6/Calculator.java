package HomeWork6;

import HomeWork6.CalException.*;

public class Calculator {

	public double powerXY(int x, int y) throws checkZero{
		double a = 0;
		a = Math.pow(x, y);
		return a;
	}
}