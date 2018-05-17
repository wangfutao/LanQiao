package 排序;

public class 选择排序 {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2, 8, 9, 1, 4, 5, 7, 6, 8 };

		System.out.println("排序前：");
		show(arr);

		selectSort(arr);
		
		System.out.println("排序后：");
		show(arr);
	}

	/**
	 * 选择排序
	 * @param a
	 */
	public static void selectSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int k = i;
			// 找出最小值的小标
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			// 将最小值放到排序序列末尾
			if (k > i) {
				swap(a,i,k);
			}
		}
	}
	/**
	 * 交换arr[i]和arr[j]
	 * @param arr
	 * @param i
	 * @param j
	 */
	public static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	/**
	 * 输出arr
	 * @param arr
	 */
	public static void show(int[] arr) {
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
}
