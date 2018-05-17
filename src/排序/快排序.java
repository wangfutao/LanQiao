package ����;

public class ������ {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2, 8, 9, 1, 4, 5, 7, 6, 8 };

		System.out.println("����ǰ��");
		show(arr);

		quickSort(arr, 0, arr.length-1);
		
		System.out.println("�����");
		show(arr);
	}

	/**
	 * ��������
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
			int pivot = a[left];// ѡ���һ��Ԫ����Ϊ��ŦԪ

			/**
			 * ����
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
			 * �ݹ�
			 */
			quickSort(a, left, i - 1);
			quickSort(a, i + 1, right);
		}
	}

	

	/**
	 * ���arr
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
