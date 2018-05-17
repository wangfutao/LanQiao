package 蓝桥练习;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class 历届试题52_小数第n位 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MAX = 1000000002;
		int a = sc.nextInt();
		int b = sc.nextInt();
		BigDecimal bA = new BigDecimal(a);
		BigDecimal bB = new BigDecimal(b);
		System.out.println(bA.divide(bB,500000,BigDecimal.ROUND_HALF_EVEN));
		
	}
}
