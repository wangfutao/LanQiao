package 牛客小白月赛2;

import java.util.Scanner;

public class B小马过河 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		double px, py, ux, uy, vx, vy;
		t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			px = sc.nextDouble();
			py = sc.nextDouble();
			ux = sc.nextDouble();
			uy = sc.nextDouble();
			vx = sc.nextDouble();
			vy = sc.nextDouble();

			double k = (vy - uy) / (vx - ux);
			double b = vy - k * vx;

			double A = k;
			double B = -1;
			double C = b;
			double dis = dis(A, B, C, px, py);

			double minX = ux < vx ? ux : vx;
			double maxX = ux > vx ? ux : vx;

			double k0 = (-1) / k;

			while (true) {
				double midX = (minX + maxX) / 2;
				double midY = k * midX + b;

				double tDis = dis(midX, midY, px, py);
				// System.out.println(tDis+" "+dis);
				if (equal(tDis, dis)) {
					// 找到
					System.out.println(midX + " " + midY);
					break;
				}

				double k1 = (py - midY) / (px - midX);
				if (k0 < 0) {
					if (k1 > k0) {
						minX = midX;
					} else {
						maxX = midX;
					}
				}else{
					if (k1 < k0) {
						minX = midX;
					} else {
						maxX = midX;
					}
				}
			}

		} 

	}

	public static boolean equal(double x, double y) {
		if (Math.abs(x - y) < 0.00000000001) {
			return true;
		}
		return false;
	}

	public static double dis(double A, double B, double C, double x0, double y0) {
		double fz = A * x0 + B * y0 + C;
		double fm = Math.sqrt(A * A + B * B);
		return Math.abs(fz / fm);
	}

	public static double dis(double x1, double y1, double x2, double y2) {
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}
}
