package ¾öÈü;

import java.util.Random;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		int a = r.nextInt(100);
		int b = a*a;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println("-------------------");
		
		Thread.sleep(1000);
		
		main(args);
	}
}
