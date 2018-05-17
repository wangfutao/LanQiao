package À¶ÇÅÁ·Ï°;

import java.util.Scanner;

public class ERRÀú½ìÊÔÌâ27_ÂìÒÏ¸ĞÃ° {
	static int[] ganMao;

	public static void main(String[] args) {
		int n;
		double sum = 100;
		double[] arr;

		int count = 0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new double[n];
		ganMao = new int[n];
		ganMao[0] = 1;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}

		while (true) {
			
			if (exitBound(arr, sum)) {
				break;
			}
			for (int i = 0; i < n; i++) {
				if (equal(Math.abs(arr[i]), 0) || equal(Math.abs(arr[i]), sum)) {
					continue;
				}
				arr[i] += 0.5;
			}

			
			xiangYu(arr);
			
//			for (double k : arr) {
//				System.out.print(k + " ");
//			}
//			System.out.println();
//
//			for (int k : ganMao) {
//				System.out.print(k + " ");
//			}
//			System.out.println();
//			System.out.println("-------");

//			xiangYu(arr);
			// count++;
			// if(count == 30){
			// break;
			// }
		}
		// for(double k:arr){
		// System.out.print(k+" ");
		// }
		// System.out.println();
		for (int k : ganMao) {
			if (k == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void xiangYu(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (equal(Math.abs(arr[i]), Math.abs(arr[j]))) {
					arr[i] = -arr[i];
					arr[j] = -arr[j];

					if(i == 0){
						if(Math.abs(arr[i]) != 0 && Math.abs(arr[j]) != 100){
							ganMao[j] = 1;
						}
					}
					

				}
			}
		}
	}

	public static boolean exitBound(double[] arr, double sum) {
		for (int i = 0; i < arr.length; i++) {
			if (!equal(Math.abs(arr[i]), 0) && !equal(Math.abs(arr[i]), sum)) {
				return false;
			}
		}
		return true;
	}

	public static boolean equal(double a, double b) {
		if (Math.abs(Math.abs(a) - Math.abs(b)) < 0.5) {
			return true;
		}
		return false;
	}
}
