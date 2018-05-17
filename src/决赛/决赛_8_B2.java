package 决赛;

public class 决赛_8_B2 {
	public static void main(String[] args) {
		char[][] arr = new char[(int) 1e+3][(int) 1e+3];
		 /*
		String str = "......................................\n"
				+ ".........................X............\n"
				+ ".......................X.X............\n"
				+ ".............XX......XX............XX.\n"
				+ "............X...X....XX............XX.\n"
				+ ".XX........X.....X...XX...............\n"
				+ ".XX........X...X.XX....X.X............\n"
				+ "...........X.....X.......X............\n"
				+ "............X...X.....................\n"
				+ ".............XX.......................\n"
				+ "......................................\n";
		 */
		///*
		  String str = ".....\n"+ ".....\n"+ ".XXX.\n"+ ".....";
		 //*/
		String[] strArr = str.split("\n");
		char[][] ch = new char[strArr.length][strArr[0].length()];

		for (int i = 0; i < strArr.length; i++) {
			ch[i] = strArr[i].toCharArray();
		}

		System.out.println("=====第0代=====");
		for (char[] a : ch) {
			for (char c : a) {
				System.out.print(c);
			}
			System.out.println();
		}

		int dai = (int) 1e+1;
		for (int i = 1; i <= dai; i++) {
			char[][] t = ch;
			for (int j = 0; j < ch.length; j++) {
				for (int k = 0; k < ch[j].length; k++) {
					boolean alive = judge(ch, j, k);
					if (alive) {
						t[j][k] = 'X';
					} else {
						t[j][k] = '.';
					}
				}
			}
			ch = t;

			System.out.println("=====第" + i + "代=====");
			for (char[] a : ch) {
				for (char c : a) {
					System.out.print(c);
				}
				System.out.println();
			}
		}

	}

	// 活 true
	public static boolean judge(char[][] arr, int x, int y) {
		boolean nowAlive = arr[x][y] == 'X' ? true : false;
		int count = 0;
		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if (i == x && j == y) {
					continue;
				}
				try {
					if (arr[i][j] == 'X') {
						count++;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					continue;
				}
				if (count > 3 && nowAlive == true) {
					return false;
				}
			}
		}

		if (nowAlive) {
			if (count < 2) {
				return false;
			}
			if (count == 2 || count == 3) {
				return true;
			}
			if (count > 3) {
				return false;
			}
		} else {
			if (count == 3) {
				return true;
			}
		}
		return false;
	}
}
