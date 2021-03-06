package Laba2;

public class NumberGenerator {

	public static int Number() {

		double x = (int)(Math.random()*((150-60)+1)+60);
		int x1 = (int) x;
		return x1;
	}
}