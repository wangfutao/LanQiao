import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class 漏掉的金额组合 {
	static Set<List<Integer>> set;
	public static void main(String[] args) {	
		int total;
		int sum = 0;
		int n;
		int[] arr;
		set = new HashSet<List<Integer>>();
		Scanner sc = new Scanner(System.in);
		total = sc.nextInt();
		n = sc.nextInt();
		arr = new int[n];
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			
			arr[i] = sc.nextInt();
			list.add(arr[i]);
			sum += list.get(i);
		}
		int err_sum = sum - total;
		//System.out.println(err_sum);
		
//		combine(list, new ArrayList<Integer>(), err_sum);
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i = 1; i <= arr.length; i++){
			combine(arr, 0, i, list1,err_sum);
		}
		
		
//		System.out.println(set);
		
	}
	
	public static void combine(List<Integer> list, List<Integer> work, int k){	
		int sum = 0;
		for(int m:work){
			sum += m;
		}
		
		if(sum == k){
			Collections.sort(work);
			System.out.println(work);
			set.add(work);
			return;
		}
		
		List<Integer> tList;
		List<Integer> tWork;
		for(int i = 0; i < list.size(); i++){
			tList = new ArrayList<Integer>(list);
			tWork = new ArrayList<Integer>(work);
			tWork.add(tList.get(i));
			for(int j = i; j >=0; j--){
				tList.remove(j);
			}
			combine(tList, tWork, k);
		}
	}
	
	public static void combine(int[] arr, int begin, int num, List<Integer> list, int err_sum){
		
		if(num == 0 ){
			int sum = 0;
			for(int i = 0; i < list.size(); i++){
				sum += list.get(i);
			}
			if(sum == err_sum){
				System.out.println(list);
			}
			return;
		}
		if( begin == arr.length){
			//System.out.println(list);
			return;
		}
		list.add(arr[begin]);
		combine(arr, begin+1, num-1, list, err_sum);
		list.remove(list.size()-1);
		combine(arr, begin+1, num, list,err_sum);
	}
	
	/*
6
5
3 2 4 3 1
	 */

	// 1 2 3 4 5 6 4 5 3 2 1 8
	
}
