package 湘潭大学程序设计竞赛;

import java.util.Scanner;

public class G又见斐波那契 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long p = 1000000007;
		
		int T = sc.nextInt();
		
		while (T-- != 0) {
			long n = sc.nextLong();
			System.out.println(fib(n,p));
		}

	}

	public static long fib(long n, long p) {
		if (n <= 1) {
			return n;
		}
		long a = 0;
		long b = 1;
		long c = 0;
		for (long i = 2; i <= n; i++) {
			c = (b%p + a%p + ((i%p * i%p * i%p)%p)%p + ((i%p * i%p)%p)%p + i%p + 1)%p;
			a = b;
			b = c;
		}
		return c;
	}
}
