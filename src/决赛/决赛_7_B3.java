package ����;
public class ����_7_B3 {
	static void f(int[] ta, int[] da, int k, int ho, int bu, int sc) {
//		System.out.println(ho);
		if (ho < 0 || bu < 0 || sc < 0)
			return;
		if (k == ta.length) {
			if (ho > 0 || bu > 0 || sc > 0)
				return;
			for (int i = 0; i < da.length; i++) {
				System.out.print(da[i] + " ");
			}
			System.out.print(" --- ");
			for (int i = 0; i < da.length; i++) {
				for (int j = 0; j < da[i]; j++)
					System.out.print(ta[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i <= bu; i++) {
			da[k] = i;
			f(ta, da, k + 1, i>0?ho-1:ho, bu - i, sc - ta[k] * i); // ���λ��
		}

		da[k] = 0;
	}

	public static void main(String[] args) {
		int[] ta = { 1, 2, 3, 5, 10, 20, 25, 50 };
		int[] da = new int[8];
		f(ta, da, 0, 3, 6, 96);
	}
}
