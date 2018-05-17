package 湘潭大学程序设计竞赛;

import java.util.Scanner;

public class D_Fibonacci进制 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] fib = new int[45];
		int max = 0;
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2;; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
			System.out.println(i + " " + fib[i]);
			if (fib[i] >= x) {
				System.out.println("----");
				//System.out.println(i + "  " + fib[i]);
				max = i - 1;
				break;
			}
		}
		while (true) {
			int[] flag = new int[max + 1];
			int t = x;
			//System.out.println("===");
			for (int i = max; i >= 1; i--) {
				if (fib[i] <= t) {
					flag[i] = 1;
					t -= fib[i];
					//System.out.print(fib[i] + " ");
				}
			}
			//System.out.println();
			//System.out.println("===");
			if(t != 0){
				break;
			}
			for (int i = max; i >= 1; i--) {
				System.out.print(flag[i]);
			}
			System.out.println();
			
			max = max - 1;
			
			if(max == 0){
				break;
			}
			
		}
	}
}
