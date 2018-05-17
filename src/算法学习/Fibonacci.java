package �㷨ѧϰ;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = (int) 1000000007;
		// int n = sc.nextInt();
		int n = 1000000000;
		//System.out.println(fib1(n, p));
		System.out.println(fib2(n, p));

	}

	public static int fib1(int n, int p) {
		if (n <= 1) {
			return 1;
		}

		int a = 1;
		int b = 1;
		int c = 0;
		for (int i = 2; i <= n; i++) {
			c = (a % p + b % p) % p;
			a = b;
			b = c;
		}
		return c;
	}

	public static int fib2(int n, int p) {
		int[][] a = {{1,1},{1,0}};
		int[][] s = pow(a,n-1,p);
		int[][] res = multi(s, new int[][]{{1},{1}}, p);
		
		return res[0][0];
	}

	public static int[][] multi(int[][] a, int[][] b, int p) {
		int[][] s = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					s[i][j] =(s[i][j] + (a[i][k]%p * b[k][j]%p)%p)%p;
				}
			}
		}
		return s;
	}
	
	public static int[][] pow(int[][] a, int n, int p){
		int[][] s = new int[a.length][a.length];
		for(int i = 0; i < s.length; i++){
			s[i][i] = 1;
		}
		while(n != 0){
			if((n&1) == 1){
				s = multi(s, a, p);
			}
			a = multi(a,a, p);
			n = n >> 1;
		}
		return s;
	}

	public static void show(int[][] n) {
		for (int[] arr : n) {
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
}
