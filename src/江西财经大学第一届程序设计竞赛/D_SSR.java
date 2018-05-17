package 江西财经大学第一届程序设计竞赛;

import java.util.Scanner;

public class D_SSR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- != 0) {
			String str = sc.next();
			char[] ch = str.toCharArray();
			int[] arr = new int[3];
			for (int i = 0; i < 3; i++) {
				arr[i] = ch[i] - 'A';
				// System.out.println(arr[i]);
			}

			int start, end;
			start = arr[0] * 19 * 19 + arr[1] * 19 + arr[2];
			end = 6857;
			System.out.println(end-start);

		}
	}
}
