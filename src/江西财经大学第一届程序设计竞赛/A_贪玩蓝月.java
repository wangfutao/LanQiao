package �����ƾ���ѧ��һ�������ƾ���;

import java.util.Scanner;

public class A_̰������ {
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
