package ����;

public class ð������ {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2, 8, 9, 1, 4, 5, 7, 6, 8 };

		System.out.println("����ǰ��");
		show(arr);

		ð������(arr);
		
		System.out.println("�����");
		show(arr);
	}

	/**
	 * ð������
	 * @param arr
	 */
	public static void ð������(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
			}
		}

	}
	
	/**
	 * ����arr[i]��arr[j]
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
	 * ���arr
	 * @param arr
	 */
	public static void show(int[] arr) {
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
}
