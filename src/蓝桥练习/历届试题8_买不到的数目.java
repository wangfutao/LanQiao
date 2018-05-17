package 蓝桥练习;

import java.util.Scanner;

public class 历届试题8_买不到的数目 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int min = a > b ? a : b;
		int max = 0;
		
		for(int k = min+1; k <= a*b;k++){
			if(!isCanZuHe(k, a, b)){
				max = k;
			}			
		}
		System.out.println(max);
	}
	public static boolean isCanZuHe(int k, int a, int b){
		if(k % a == 0 || k % b == 0){
			return true;
		}
		for(int i = a; i <= k; i += a){
			for(int j = b; j <= k; j += b){
				if(i + j == k){

					return true;
				}
				if(i + j > k){
					break;
				}
				
			}
		}
		return false;
	}
}
