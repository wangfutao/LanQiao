package 北京师范大学第十六届程序设计竞赛决赛;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E {
	static List<Integer> list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		list = new ArrayList<Integer>();
		int T = sc.nextInt();
		for(int t = 0; t < T; t++){
			int n, k;
			n = sc.nextInt();
			k = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n;i++){
				arr[i] = sc.nextInt();
			}
			int[] b = new int[k];
			combine(arr, arr.length, k, b, k);
			int sum = 0;
			for(int m:list){
				sum = sum ^ m;
			}
			System.out.println(sum);
		}
	}
	
	public static void combine(int[] a, int n, int m, int[] b,int M){
		for(int i = n; i >= m; i--){
			b[m-1] = i-1;
			if(m>1){
				combine(a, i-1, m-1, b, M);
			}else{
				int sum = 0;
				for(int j = M-1; j >=0;j--){
					sum += a[b[j]];
					//System.out.print(a[b[j]] + " ");
					
				}
				sum = sum * sum;
				list.add(sum);
			}
		}
	}
}
