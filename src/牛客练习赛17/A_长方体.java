package ţ����ϰ��17;

import java.util.Scanner;

public class A_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		System.out.println((int)Math.sqrt(a*c/b + a*b/c + b*c/a +2*a + 2*b+2*c)*4);
		
	}
}
