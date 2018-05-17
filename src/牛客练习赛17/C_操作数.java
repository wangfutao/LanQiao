package 牛客练习赛17;

import java.util.Random;
import java.util.Scanner;

public class C_操作数 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int p = 1000000007;
		int n = sc.nextInt();
		int k = sc.nextInt();
		//int n = 30;
		//int k = 1000000000;
		int[] a = new int[n];
		int[] s = new int[n];

		Random r = new Random();
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			//a[i] = r.nextInt(1000000001);
		}

		while (k-- != 0) {			
			int sum = a[0];
			for (int i = 1; i < n; i++) {
				sum  = (sum + a[i] % p) % p;
				a[i] = sum;
			}	

		}
	
		for (int i = 0; i < n-1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print(a[n-1]);
		
		
		System.out.println("\n----");
	
		System.out.println(System.currentTimeMillis() - start + "ms");
	}

}
