package 算法学习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 密码学的关键 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		String p = sc.next(); 
		String k = sc.next();
		
		char[] pwd = p.toCharArray();
		
		
		List<Character> key = new ArrayList<Character>();
		
		char[] kk = k.toCharArray();
		for(int i = 0; i < kk.length;i++){
			key.add(kk[i]);
		}
		
		char[] msg = new char[p.length()];
		for(int i = 0; i < pwd.length; i++){
			int t = ((pwd[i]-'A') - (key.get(i) - 'A'));
			if( t > 0){
				msg[i] = (char)('A' + t);
			}else{
				msg[i] = (char)('Z' + t + 1);
			}
			//msg[i] = (char)(pwd[i] - (key.get(i) - 'A'));
			
			key.add(msg[i]);
		}
		
		System.out.println(msg);
		
		
	}
}
