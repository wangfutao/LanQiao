package �㷨ѧϰ;

public class ������� {
	public static void main(String[] args) {
		int n = 8;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = i + 1;
		}
		ȫ����_�ݹ�(arr, 0);
	}
	
	public static void ȫ����_�ݹ�(int[] arr, int k){
		if(k == arr.length){
			show(arr);
			return;
		}
		for(int i = k; i < arr.length; i++){
			swap(arr,i,k);
			ȫ����_�ݹ�(arr, k+1);
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
