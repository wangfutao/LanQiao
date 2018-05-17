package 决赛;

public class 决赛_6_B2_五星填数 {
	static int count = 0;

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 };
		f(arr, 0);
		System.out.println(count/10);
	}

	public static void f(int[] arr, int k) {
		if (k == arr.length) {
			if (judge(arr))
				count++;
			return;
		}
		for (int i = k; i < arr.length; i++) {
			swap(arr, i, k);
			f(arr, k + 1);
			swap(arr, i, k);
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	public static boolean judge(int[] a) {
		int s = a[1] + a[2] + a[3] + a[4];
		if (a[0] + a[2] + a[5] + a[8] != s) {
			return false;
		}
		if (a[0] + a[3] + a[6] + a[9] != s) {
			return false;
		}
		if (a[1] + a[5] + a[7] + a[9] != s) {
			return false;
		}
		if (a[4] + a[6] + a[7] + a[8] != s) {
			return false;
		}
		return true;
	}
}
