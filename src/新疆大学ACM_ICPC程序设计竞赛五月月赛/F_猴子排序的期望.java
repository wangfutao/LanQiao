package 新疆大学ACM_ICPC程序设计竞赛五月月赛;

import java.util.Scanner;

public class F_猴子排序的期望 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		char[] arr = str.toCharArray();
		sort(arr);
		//System.out.println(arr);
		int sum = 1;
		
		for(int i = 0; i < arr.length;){
			char t = arr[i];
			int len = 1;
			for(int j = i+1; j < arr.length;j++){
				if(arr[j] != t){					
					break;
				}
				len++;
			}
			i += len;
			sum *= c(n,len);
			n -= len;
		}
		System.out.println("1/"+sum);
	}
	
	
	
	public static void sort(char[] arr){
		for(int i = 0; i < arr.length;i++){
			for(int j = i+1;j < arr.length;j++){
				if(arr[i] > arr[j]){
					char t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}
	
	public static int c(int n, int m){
		//System.out.println("C("+n+","+m+")");
		int sum1 = 1;
		for(int i = 0; i < m; i++){
			sum1 *= n--;
		}
		int sum2 = 1;
		for(int i = 1; i <= m; i++){
			sum2 *= i;
		}
		return sum1/sum2;
	}
}
