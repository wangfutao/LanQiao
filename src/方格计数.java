

public class 方格计数 {
	public static void main(String[] args) {
		int count = 0;

		for (int i = 0; i < 2000 - 1; i++) {
			for (int j = 0; j < 2000 - 1; j++) {
				if (   distance(i, j, 1000, 1000) <= 1000 
					&& distance(i, j + 1, 1000, 1000) <= 1000
					&& distance(i + 1, j, 1000, 1000) <= 1000 
					&& distance(i + 1, j + 1, 1000, 1000) <= 1000) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

	public static double distance(double x1, double y1, double x2, double y2) {
		double d = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
		return Math.sqrt(d);
	}
}
