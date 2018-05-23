package �㷨ѧϰ;

import java.util.Random;

public class ���� {
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
		��������(temp, 0, n-1);
		end = System.currentTimeMillis();
		System.out.println("��������use:"+(end-start)+"ms");
		///////	
		
		
		
	}
	public static void ��������(int[] arr, int left, int right){
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
		//����i��Ԫ�غ�key����
		arr[left] = arr[i];
		arr[i] = key;
		��������(arr, left, i-1);
		��������(arr, i+1, right);
	}
	public static void ��ͨ����(int[] arr){
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
