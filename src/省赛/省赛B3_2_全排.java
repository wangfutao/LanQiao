package 省赛;

public class 省赛B3_2_全排 {
	static int count = 0;
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,0};
		f(arr, 0);
		System.out.println(count);
	}
	
	public static void f(int[] arr, int k){
		if(k == arr.length){
//			if(judge(arr)){
//				count++;
//			}
			count++;
			return;
		}
		for(int i = k; i < arr.length; i++){
			swap(arr, k, i);
			f(arr, k+1);
			swap(arr, k, i);
		}
	}
	
	public static void swap(int[] arr, int a, int b){
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
		
	}
	public static boolean judge(int[] arr) {
		double x = arr[0] + arr[1] * 1.0 / arr[2]
				+ (arr[3] * 100 + arr[4] * 10 + arr[5]) * 1.0
				/ (arr[6] * 100 + arr[7] * 10 + arr[8]);
		if (x == 10.0)
			return true;
		return false;
	}
}
