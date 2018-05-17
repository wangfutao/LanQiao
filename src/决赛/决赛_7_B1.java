package 决赛;

public class 决赛_7_B1 {
	static int count = 0;
	static double x_a = 0;
	static double x_b = 1000;
	static double x_c = 0;

	public static void fab() {

		double s = x_b - x_a;
		if (s <= 1) {
			return;
		}

		double t;

		t = s / 60;
		x_a += 10 * t;
		x_b -= 10 * t;
		//x_c += 50 * t;

		count++;

		fba();

	}

	public static void fba() {
		double s = x_b - x_a;
		if (s < 1) {
			count--;
			return;
		}

		double t;
		
		t = s / 60;
		x_a += 10 * t;
		x_b -= 10 * t;
		//x_c -= 50 * t;
		
		fab();
	}

	public static void main(String[] args) throws InterruptedException {
		fab();
//		System.out.println(x_a+"  "+x_b);
		System.out.println(count);
	}
}
