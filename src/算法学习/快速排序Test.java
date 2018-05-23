package 算法学习;

public class 快速排序Test {
	public static void main(String[] args) {
		int[] arr = { 5, 1, 2, 3, 4, 6, 8, 7, 1, 0, 12, 45 };
		quickSort(arr, 0, arr.length - 1);
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();

	}

	public static void quickSort(int[] arr, int left, int right) {
		if (left > right) {
			return;
		}
		int i = left;
		int j = right;
		int key = arr[left];
		while (i != j) {

			while (i < j) {
				if (arr[j] < key) {
					break;
				}
				j--;
			}
			while (i < j) {
				if (arr[i] > key) {
					break;
				}
				i++;
			}
			
			if (i < j) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		arr[left] = arr[i];
		arr[i] = key;
		quickSort(arr, left, i - 1);
		quickSort(arr, i + 1, right);
	}
}
