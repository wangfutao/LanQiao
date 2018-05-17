package 江西财经大学第一届程序设计竞赛;

import java.util.Scanner;

public class A_贪玩蓝月 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int T = sc.nextInt();
		while((T--) != 0){
			int n =  sc.nextInt();
			if(n == 0){
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(a+b);
			}else if(n == 1){
				String s = sc.next();
				System.out.println(s.length());
			}
		}
		
	}
}
