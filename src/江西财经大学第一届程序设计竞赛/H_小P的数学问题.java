package 江西财经大学第一届程序设计竞赛;

import java.math.BigInteger;
import java.util.Scanner;

public class H_小P的数学问题 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int T = sc.nextInt();
		int p = 1000000007;
		System.out.println(factorial(10000, p));
	}
	
	public static int  factorial(int n, int p){
		int res = 1;		
		for(int i = 1; i <= n;i++){
			res = ((res%p) * (i%p))%p;		
		}
		return res;
	}
}
