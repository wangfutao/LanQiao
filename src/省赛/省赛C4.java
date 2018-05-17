package 省赛;
public class 省赛C4 {

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		int n = 0;
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 6; j++)
				for (int k = 0; k < 6; k++) {
					if (i + 1 == j + k + 2 || j + 1 == i + k + 2
							|| k + 1 == i + j + 2)
						n++; // 填空位置
				}

		int m = gcd(n, 6 * 6 * 6);
		System.out.println(n / m + "/" + 6 * 6 * 6 / m);
	}

}
