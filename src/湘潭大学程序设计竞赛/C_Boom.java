package 湘潭大学程序设计竞赛;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class C_Boom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;

		t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n;
			n = sc.nextInt();
			int minX = 1000;
			int maxX = -10;
			int minY = 1000;
			int maxY = -10;
			List<Boom> booms = new ArrayList<Boom>();
			Set<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < n; j++) {
				int x1, y1, x2, y2;
				x1 = sc.nextInt();
				y1 = sc.nextInt();
				x2 = sc.nextInt();
				y2 = sc.nextInt();

				if (x1 < minX) {
					minX = x1;
				}
				if (x2 > maxX) {
					maxX = x2;
				}
				if (y1 < minY) {
					minY = y1;
				}
				if (y2 > maxY) {
					maxY = y2;
				}
				Boom boom = new Boom(x1, y1, x2, y2);
				booms.add(boom);

			}
			
			for (int x = minX; x <= maxX - 1; x++) {
				for (int y = minY; y <= maxY - 1; y++) {
					int count = 0;
					for (Boom b : booms) {
						if (judge(x, y, b)) {
							count++;
						}

					}
					set.add(count);
				}
			}
			int max = 0;
			for (int c : set) {
				if (c > max) {
					max = c;
				}
			}
			System.out.println(max);

		}
	}

	public static boolean judge(int x, int y, Boom b) {
		double x0 = (x + x + 1) * 1.0 / 2;
		double y0 = (y + y + 1) * 1.0 / 2;
		if (x0 > b.x1 && y0 > b.y1 && x0 < b.x2 && y0 < b.y2) {
			return true;
		}
		return false;

	}
}

class Boom {
	int x1;
	int y1;
	int x2;
	int y2;

	public Boom(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

}
