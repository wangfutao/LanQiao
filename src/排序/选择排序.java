package ����;

public class ѡ������ {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2, 8, 9, 1, 4, 5, 7, 6, 8 };

		System.out.println("����ǰ��");
		show(arr);

		selectSort(arr);
		
		System.out.println("�����");
		show(arr);
	}

	/**
	 * ѡ������
	 * @param a
	 */
	public static void selectSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int k = i;
			// �ҳ���Сֵ��С��
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			// ����Сֵ�ŵ���������ĩβ
			if (k > i) {
				swap(a,i,k);
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
