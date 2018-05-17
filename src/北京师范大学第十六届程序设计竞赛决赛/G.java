package 北京师范大学第十六届程序设计竞赛决赛;

import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			String str = sc.next();
			convert(str);
		}
		

	}
	
	public static void convert(String str){
		
//		System.out.print(str+"---");
		if(str.length() == 0){
			return;
		}
		int count = 0;
		boolean flag = false;
		char[] arr = str.toCharArray();
		if(arr.length == 1){
			System.out.println(str);
			return;
		}
		if(xiaoXie(arr[0]) && daXie(arr[1]) || daXie(arr[arr.length-1])){
			System.out.println(str);
			return;
		}
		if(daXie(arr[0])){
			boolean allXiaoXie = true;
			for(int i = 1; i < arr.length; i++){
				if(daXie(arr[i])){
					allXiaoXie = false;
				}
			}
			if(allXiaoXie){
				System.out.println(str);
				return;
			}
		}
		boolean allXiaoXie = true;
		for(char c:arr){
			if(daXie(c)){
				allXiaoXie = false;
			}
		}
		if(allXiaoXie){
			System.out.println(str);
			return;
		}
		String[] s = new String[arr.length];
		for(int i = 0; i < arr.length; i++){
			s[i] = arr[i] + "";
		}
		for(int i = 0; i < arr.length-1; i++){
			if(daXie(arr[i])){
				flag = true;
				if(daXie(arr[i+1])){
					System.out.println(str);
					return;
				}
				
				
				s[i] = "_"+s[i];
			}
			
		}
		if(s[0].charAt(0) == '_'){
			s[0] = s[0].replace("_", "");
		}
		StringBuilder res = new StringBuilder();
		for(String ss:s){
			res.append(ss);
		}
		
		System.out.println(res.toString().toLowerCase());
		
	}
	
	public static boolean xiaoXie(char ch){
		if(ch >= 'a' && ch <= 'z'){
			return true;
		}
		return false;
	}
	public static boolean daXie(char ch){
		if(ch >= 'A' && ch <= 'Z'){
			return true;
		}
		return false;
	}
}
