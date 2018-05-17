package 牛客练习赛17;

import java.util.Scanner;

public class B_好位置 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s, x;
		s = sc.next();
		x = sc.next();
		if(!s.contains(x)){
			System.out.println("No");
			return;
		}
		char[] arr = s.toCharArray();
		
		
		boolean exits = true;
		
		for(int i = 0; i < arr.length; i++){
			if(!x.contains(arr[i]+"")){
				exits = false;
				break;
			}
		}
		if(exits){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
