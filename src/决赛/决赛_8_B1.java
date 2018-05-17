package 决赛;

import java.math.BigDecimal;
import java.math.BigInteger;

public class 决赛_8_B1 {

	static int count = 0;
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int[] arr1 = { 1, 2, 3, 4 };

		f(arr, 0);
		
		//System.out.println(judge("9814072355"));

	}

	public static void f(int[] arr, int k) {
		if (k == arr.length) {
			if (arr[0] == 0) {
				return;
			}
			String numStr = arr2Str(arr);
			// BigInteger num = new BigInteger(numStr);
			if(judge(numStr)){
				System.out.println(numStr);
			}
			
			count++;
//			System.out.println(count);
			return;
		}
		for (int i = k; i < arr.length; i++) {
			swap(arr, i, k);
			f(arr, k + 1);
			swap(arr, i, k);
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	public static void showArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static String arr2Str(int[] arr) {
		StringBuilder str = new StringBuilder();
		for (int k : arr) {
			str.append(k);
		}
		return str.toString();
	}

	public static boolean judge(String str) {

		int min = 31990;
		int max = 99381;
		int mid;
		BigInteger num = new BigInteger(str);
		while(true){
			mid = (min + max) / 2;
			BigInteger midNum = new BigInteger(mid+"");
			BigInteger midRes = midNum.multiply(midNum);
			
//			System.out.println(min+"  "+max+"  "+mid);
			
//			System.out.println(midRes+"  "+num);
			if(min >= max-1){
//				System.out.println("min:"+min+" < max:"+max);
				break;
			}
			if(midRes.compareTo(num) == 0){
				return true;
			}
			if(midRes.compareTo(num)<0){
				min = mid;
			}else{
				max = mid;
			}
		}
		return false;

	}
}
