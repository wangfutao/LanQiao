package 北京师范大学第十六届程序设计竞赛决赛;

import java.util.Scanner;
import java.util.Stack;

public class H_吾好梦中做题 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			char[] ch = new char[n];
			String str = sc.next();
			ch = str.toCharArray();
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt();
				int k = sc.nextInt();
				if (x == 1) {
					swap(ch, k);
				}
				if (x == 2) {
					System.out.println(getLength(ch, k));
				}
			}

		}
	}

	public static void swap(char[] ch, int k) {
		k = k - 1;
		if (ch[k] == '(') {
			ch[k] = ')';
		} else {
			ch[k] = '(';
		}
	}

	public static int getLength(char[] chs, int k) {
//		for (char c : ch) {
//			System.out.print(c + " ");
//		}
//		System.out.println();
		
		if (chs[k - 1] == ')') {
			return 0;
		}
		
		char[] ch = new char[chs.length];
		for(int i = 0; i < chs.length; i++){
			ch[i] = chs[i];
		}
		
		
		int count = 0;
		//Stack<Character> sk = new Stack<>();
		for (int i = k; i < ch.length; i++) {
			if (ch[i] == ')') {
				if(ch[i-1] == '('){
					ch[i] = ' ';
					ch[i-1] = ' ';					
				}
			}
		}
		for(int i = k-1;i < ch.length; i++){
			if(ch[i] != ' '){
				break;
			}
			count++;
		}
		return count;
		

	}
}
// ) () ( ) ) ) ) ( ) ( ) )
