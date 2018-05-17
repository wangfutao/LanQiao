package 算法学习;

public class 排列组合 {
	public static void main(String[] args) {
		int n = 8;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = i + 1;
		}
		全排列_递归(arr, 0);
	}
	
	public static void 全排列_递归(int[] arr, int k){
		if(k == arr.length){
			show(arr);
			return;
		}
		for(int i = k; i < arr.length; i++){
			swap(arr,i,k);
			全排列_递归(arr, k+1);
			swap(arr,i,k);
		}
	}
	public static void swap(int[] arr, int i, int j){
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	public static void show(int[] arr){
		for(int k:arr){
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
