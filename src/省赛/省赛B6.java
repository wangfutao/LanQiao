package 省赛;
public class 省赛B6 {
	public static void main(String[] args) {
		int count = 0;
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				if (xiangLin(b, a) || b == a) {
					continue;
				}
				for (int c = 0; c <= 9; c++) {
					if (xiangLin(c, b) || c == a || c == b) {
						continue;
					}
					for (int d = 0; d <= 9; d++) {
						if (xiangLin(d, a) || d == a || d == b || d == c) {
							continue;
						}
						for (int e = 0; e <= 9; e++) {
							if (xiangLin(e, a, d, b) || e == a || e == b
									|| e == c || e == d) {
								continue;
							}
							for (int f = 0; f <= 9; f++) {
								if (xiangLin(f, a, b, c, e) || f == a || f == b
										|| f == c || f == d || f == e) {
									continue;
								}
								for (int g = 0; g <= 9; g++) {
									if (xiangLin(g, b, c, f) || g == a
											|| g == b || g == c || g == d
											|| g == e || g == f) {
										continue;
									}
									for (int h = 0; h <= 9; h++) {
										if (xiangLin(h, d, e) || h == a
												|| h == b || h == c || h == d
												|| h == e || h == f || h == g) {
											continue;
										}
										for (int i = 0; i <= 9; i++) {
											if (xiangLin(i, d, e, f, h)
													|| i == a || i == b
													|| i == c || i == d
													|| i == e || i == f
													|| i == g || i == h) {
												continue;
											}
											for (int j = 0; j <= 9; j++) {
												if (xiangLin(j, e, f, g, i)
														|| j == a || j == b
														|| j == c || j == d
														|| j == e || j == f
														|| j == g || j == h
														|| j == i) {
													continue;
												}
												System.out.println(" " + a + ""
														+ b + "" + c);
												System.out.println(d + "" + e
														+ "" + f + "" + g);
												System.out.println(h + "" + i
														+ "" + j);
												System.out
														.println("-------------");
												count++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println(count);

	}

	public static boolean xiangLin(int x, int n1) {
		if (x == n1 + 1 || x == n1 - 1) {
			return true;
		}

		return false;
	}

	public static boolean xiangLin(int x, int n1, int n2) {
		if (x == n1 + 1 || x == n1 - 1 || x == n2 + 1 || x == n2 - 1) {
			return true;
		}

		return false;
	}

	public static boolean xiangLin(int x, int n1, int n2, int n3) {
		if (x == n1 + 1 || x == n1 - 1 || x == n2 + 1 || x == n2 - 1
				|| x == n3 + 1 || x == n3 - 1) {
			return true;
		}
		return false;
	}

	public static boolean xiangLin(int x, int n1, int n2, int n3, int n4) {
		if (x == n1 + 1 || x == n1 - 1 || x == n2 + 1 || x == n2 - 1
				|| x == n3 + 1 || x == n3 - 1 || x == n4 + 1 || x == n4 - 1) {
			return true;
		}
		return false;
	}
}
