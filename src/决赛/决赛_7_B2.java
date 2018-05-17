package 决赛;

public class 决赛_7_B2 {
	static int count = 0;

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		f(arr, 0);

		System.out.println(count / 8);
		System.out.println(System.currentTimeMillis() - start);

	}

	public static void f(int[] arr, int k) {

		if (k == arr.length) {
			if (judge(arr)) {
				count++;
			}
			return;
		}

		for (int i = k; i < arr.length; i++) {
			swap(arr, i, k);

			f(arr, k + 1);

			swap(arr, i, k);
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}

	public static boolean judge(int[] arr) {
		int[] a = arr;
		int s1 = a[0] + a[1] + a[2];
		int s2 = a[3] + a[4] + a[5];
		int s3 = a[6] + a[7] + a[8];

		int s4 = a[0] + a[3] + a[6];
		int s5 = a[1] + a[4] + a[7];
		int s6 = a[2] + a[5] + a[8];

		int s7 = a[0] + a[4] + a[8];
		int s8 = a[2] + a[4] + a[6];

		if (s1 == s2 || s1 == s3 || s1 == s4 || s1 == s5 || s1 == s6
				|| s1 == s7 || s1 == s8) {
			return false;
		}

		if (s2 == s3 || s2 == s4 || s2 == s5 || s2 == s6 || s2 == s7
				|| s2 == s8) {
			return false;
		}
		if (s3 == s4 || s3 == s5 || s3 == s6 || s3 == s7 || s3 == s8) {
			return false;
		}
		if (s4 == s5 || s4 == s6 || s4 == s7 || s4 == s8) {
			return false;
		}
		if (s5 == s6 || s5 == s7 || s5 == s8) {
			return false;
		}
		if (s6 == s7 || s6 == s8) {
			return false;
		}
		if (s7 == s8) {
			return false;
		}
		return true;
	}
}
