package 北京师范大学第十六届程序设计竞赛决赛;

import java.util.Scanner;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class C {
//	static int count = 0;
//	static int count1 = 0;
//	static List<Integer> list = new ArrayList<>();
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int T;
//		T = sc.nextInt();
//		for (int i = 0; i < T; i++) {
//			int n;
//			count = 0;
//			count1 = 0;
//			n = sc.nextInt();
//			int[] arr = new int[n];
//			for (int j = 0; j < n; j++) {
//				arr[j] = j + 1;
//			}
//			f(arr,0);
//			Collections.sort(list);
//			System.out.println(list);
//			System.out.println(count*1.0/count1);
//		}
//	}
//
//	public static void f(int[] arr, int k) {
//		if (k == arr.length) {
//			int c = countH(arr);
//			count +=c;
//			count1++;
//			list.add(c);
//			return;
//		}
//
//		
//		for (int i = k; i < arr.length; i++) {
//			swap(arr, i, k);
//			f(arr, k + 1);
//			swap(arr, i, k);
//		}
//		
//
//	}
//
//	public static void swap(int[] arr, int i, int j) {
//		int t = arr[i];
//		arr[i] = arr[j];
//		arr[j] = t;
//	}
//
//	public static int countH(int[] arr) {
//		int c = 0;
//		
//		for (int i = 0; i < arr.length-1; i++) {
//			int h = Math.abs(arr[i] - arr[i+1]);
//			c += h;
//			
//		}
//		
//	
//		
//		return c;
//	}
//	
//	
//}


public class C{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = i+1;
		}
		int c = 0;
		for(int i = 0; i < arr.length;i++){
			int h = Math.abs(arr[i] - arr[n-i-1]);
			c += h;
		}
		System.out.println(c);
	}
}
