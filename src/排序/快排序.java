package 排序;

public class 快排序 {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2, 8, 9, 1, 4, 5, 7, 6, 8 };

		System.out.println("排序前：");
		show(arr);

		quickSort(arr, 0, arr.length-1);
		
		System.out.println("排序后：");
		show(arr);
	}

	/**
	 * 快速排序
	 * @param a
	 * @param left
	 * @param right
	 */
	static void quickSort(int[] a, int left, int right) {
		if (a == null || a.length <= 1) {
			return;
		}
		if (left < right) {
			int i = left, j = right;
			int pivot = a[left];// 选择第一个元素作为枢纽元

			/**
			 * 分制
			 */
			while (i < j) {
				while (i < j && a[j] >= pivot) {
					j--;
				}
				if (i < j) {
					a[i] = a[j];
					i++;
				}

				while (i < j && a[i] < pivot) {
					i++;
				}
				if (i < j) {
					a[j] = a[i];
					j--;
				}
			}

			a[i] = pivot;

			/**
			 * 递归
			 */
			quickSort(a, left, i - 1);
			quickSort(a, i + 1, right);
		}
	}

	

	/**
	 * 输出arr
	 * 
	 * @param arr
	 */
	public static void show(int[] arr) {
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
}
