package 算法学习;

import java.util.Random;

public class 排序 {
	public static void main(String[] args) {
		Random random = new Random();
		long start, end;
		//int n = random.nextInt(500000) + 5;
		int n = 50000;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = random.nextInt(1000000000);
		}
		//show(arr);
		
		///////
		int[] temp = copyArr(arr);
		start = System.currentTimeMillis();
		快速排序(temp, 0, n-1);
		end = System.currentTimeMillis();
		System.out.println("快速排序use:"+(end-start)+"ms");
		///////	
		
		
		
	}
	public static void 快速排序(int[] arr, int left, int right){
		if(left > right){
			return;
		}
		int i = left;
		int j = right;
		int key = arr[i];
		while(i != j){
			while(arr[j] >= key && i < j){
				j--;
			}
			while(arr[i] <= key && i < j){
				i++;
			}
			if(i < j){
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t; 
			}
		}
		//将第i个元素和key交换
		arr[left] = arr[i];
		arr[i] = key;
		快速排序(arr, left, i-1);
		快速排序(arr, i+1, right);
	}
	public static void 普通排序(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}

	public static int[] copyArr(int[] arr){
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			res[i] = arr[i];
		}
		return res;
	}
	public static void show(int[] arr){
		for(int k:arr){
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
