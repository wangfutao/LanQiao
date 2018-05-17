package 省赛;
import java.util.Scanner;


public class 省赛A9 {
	
	static int count = 0;
	
	public static void main(String[] args) {
		int n;
		int[] arr;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		sort(arr, 0);
		
		for(int k:arr){
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println(count);
		
	}
	
	public static void sort(int[] arr, int k){
		
		boolean sorted = true;
		for(int i = 0; i < arr.length-1; i++){
			if(arr[i] > arr[i+1]){
				sorted = false;
			}
		}
		if(sorted){
			return;
		}
		if(k ==  arr.length){
			return;
		}
	
		int min = arr[k];
		int min_index = k;
		for(int i = k; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
				min_index = i;
			}
		}
		int t = arr[k];
		arr[k] = arr[min_index];
		arr[min_index] = t;
		count++;
		for(int i = 0; i < arr.length-1; i++){
			if(arr[i] > arr[i+1]){
				k = i;
				break;
			}
		}
		sort(arr, k);
	}
}
