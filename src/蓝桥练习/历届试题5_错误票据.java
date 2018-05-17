package À¶ÇÅÁ·Ï°;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Àú½ìÊÔÌâ5_´íÎóÆ±¾İ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int[] arr = new int[100001];
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++){
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			for(int j = 0; j < ss.length; j++){
				try{
					int k = Integer.parseInt(ss[j]);
					if(arr[k] != 0){
						b = arr[k];
					}
					arr[k] = k;
				}catch (Exception e) {
					
				}
			}
		}
		
		boolean flag = false;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != 0){
				flag = true;
			}
			if(flag && arr[i] == 0){
				a = arr[i-1]+1;
				break;
			}
		}
		System.out.println(a+" "+b);
		
		
		
	}
}
