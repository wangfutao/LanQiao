import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class 排列组合 {

	static int[] arr;

	static int[] res;

	static int[] pd;

	static int count = 0;

	public static void main(String[] args) {
		arr = new int[] { 1, 2, 3, 4,5,6,7,8,9,10,11};
		res = new int[arr.length];

		//List<Integer> list = new ArrayList<Integer>();
		//combine(arr, 0, 5, new ArrayList<Integer>());
		//System.out.println(list);

		// pd = new int[arr.length];
		// for (int i = 0; i < pd.length; i++) {
		// pd[i] = 0;
		// }

		 long start = System.currentTimeMillis();
		 f(arr, 0);
		
		 System.out.println(count + "   用时："
		 + (System.currentTimeMillis() - start));
		
		// count = 0;

		// start = System.currentTimeMillis();
		// dfs(arr, 0);
		// System.out.println(count +"   用时："+(System.currentTimeMillis() -
		// start));

		// List<Integer> list = new ArrayList<Integer>();
		// for(int i = 0; i < arr.length; i++){
		// list.add(arr[i]);
		// }
		// List<Integer> list2 = new ArrayList<Integer>();
		// combine(list, list2, 3);

	}

	public static void combine(int[] arr, int begin, int num, List<Integer> list) {
		if (num == 0) {
			System.out.println(list);
			return;
		}
		if (begin == arr.length) {
			return;
		}
		list.add(arr[begin]);
		combine(arr, begin + 1, num - 1, list);
		list.remove(list.size()-1);
		combine(arr, begin + 1, num, list);
	}

	public static void dfs(int[] arr, int k) {
		if (k == arr.length) {
			// for(int m:res){
			// System.out.print(m+" ");
			// }
			// System.out.println();
			// System.out.println("-----------");
			count++;
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (pd[i] == 0) {
				pd[i] = 1;
				res[k] = arr[i];
				dfs(arr, k + 1);
				pd[i] = 0;
			}
		}
	}

	public static void f(int[] arr, int k) {
		if (k == arr.length) {
			count++;
//			for (int m : arr) {
//				System.out.print(m + " ");
//			}
//			System.out.println();
			return;
		}
		for (int i = k; i < arr.length; i++) {
			swap(arr, k, i);
			f(arr, k + 1);
			swap(arr, k, i);
		}
	}

	public static void combine(List<Integer> list, List<Integer> work, int k) {
		List<Integer> tList;
		List<Integer> tWork;
		if (work.size() == k) {
			System.out.println(work);
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			tList = new ArrayList<Integer>(list);
			tWork = new ArrayList<Integer>(work);
			tWork.add(tList.get(i));
			for (int j = i; j >= 0; j--) {
				tList.remove(j);
			}
			combine(tList, tWork, k);
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}

}
