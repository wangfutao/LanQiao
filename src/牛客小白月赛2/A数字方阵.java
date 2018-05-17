package 牛客小白月赛2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class A数字方阵 {
	static int[][] arr;
	static int n;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		int[] num = new int[n * n];
		for (int i = 0; i < n * n; i++) {
			num[i] = (i + 1);
		}

		int i1 = 0;
		int j1 = 0;
		for (int i = 0; i < num.length; i++) {
			arr[i1][j1++] = num[i];
			if (j1 == n) {
				j1 = 0;
				i1++;
			}
		}
		// show2Arr(arr);

		// f(num, 0);

		while (true) {
			Random r = new Random();

			int i2 = r.nextInt(n);
			int j2 = r.nextInt(n);

			int i3 = r.nextInt(n);
			int j3 = r.nextInt(n);

			int t = arr[i2][j2];
			arr[i2][j2] = arr[i3][j3];
			arr[i3][j3] = t;

			if (judge()) {
				show2Arr(arr);
				return;
			}

			
		}

	}


	public static void show2Arr(int[][] arr) {
		for (int[] num : arr) {
			for (int k : num) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	public static boolean judge() {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += arr[i][j];
			}
			set.add(sum);
		}

		if (set.size() != n) {
			return false;
		}

		for (int j = 0; j < n; j++) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += arr[i][j];
			}
			set.add(sum);
		}
		if (set.size() != n * 2) {
			return false;
		}

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n - i - 1];
		}
		set.add(sum1);
		set.add(sum2);
		if (set.size() != (n * 2 + 2)) {
			return false;
		}

		return true;
	}
}
