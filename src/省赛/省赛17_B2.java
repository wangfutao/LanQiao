package 省赛;

public class 省赛17_B2 {
	static int count = 0;
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		f(arr, 0);
		System.out.println(count/6);
	}
	
	public static void f(int[] arr, int k){
		if(k == arr.length){
			if(judge(arr)){
				count++;
			}
		}
		
		for(int i = k; i < arr.length; i++){
			swap(arr, i, k);
			f(arr, k + 1);
			swap(arr, i, k);
			
		}
	}
	public static void swap(int[] arr, int a, int b){
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	public static boolean judge(int[] arr){
		int a = arr[0] + arr[1] + arr[3] + arr[5];
		int b = arr[0] + arr[2] + arr[4] + arr[8];
		int c = arr[5] + arr[6] + arr[7] + arr[8];
		if(a == b && a == c && b == c){
			return true;
		}
		return false;
	}
}
