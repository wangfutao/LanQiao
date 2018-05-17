package 北京师范大学第十六届程序设计竞赛决赛;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n;
			try{
				n = sc.nextInt();
			}catch(InputMismatchException e){
				sc.next();
				n = sc.nextInt();
			}
			boolean pass = true;
			
			for (int j = 0; j < n; j++) {
				String str = sc.next();
		
				if (!str.equals("PERFECT")) {
					pass = false;
				}
			}
			if (pass) {
				System.out.println("MILLION Master");
			} else {
				System.out.println("NAIVE Noob");
			}
		}

	}

}
