package 省赛;
public class 省赛B3_1_dfs {
	static int count = 0;

	public static void main(String[] args) {
		int[] arr = new int[9];
		dfs(arr, 0);
		System.out.println(count);

	}

	public static void dfs(int[] arr, int index) {
		if (index == 9) {
			if (judge(arr)) {
				count++;
			}
			return;
		}
		for (int i = 1; i <= 9; i++) {
			arr[index] = i;
			if (!hasSame(arr, index)) {
				dfs(arr, index + 1);
			}

		}
	}

	public static boolean hasSame(int[] arr, int index) {
		for (int i = index - 1; i >= 0; i--) {
			if (arr[i] == arr[index]) {
				return true;
			}
		}
		return false;
	}

	public static boolean judge(int[] arr) {
		double x = arr[0] + arr[1] * 1.0 / arr[2]
				+ (arr[3] * 100 + arr[4] * 10 + arr[5]) * 1.0
				/ (arr[6] * 100 + arr[7] * 10 + arr[8]);
		if (x == 10.0)
			return true;
		return false;
	}
}
