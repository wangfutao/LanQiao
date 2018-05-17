package 省赛;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class 省赛Bx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int[] data;
		int[] newData;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		n = sc.nextInt();
		data = new int[n];
		newData = new int[n];
		
		for(int i = 0; i < n; i++){
			data[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < n; i++){
			
			if(!map.containsKey(data[i])){				
				newData[i] = -data[i];
				map.put(data[i], i);
				
			}else{
				newData[i] = count(data, map.get(data[i]), i);
				map.put(data[i], i);
			}
			
			
			
		}
		
		for(int i  = 0; i < n-1; i++){
			System.out.print(newData[i] + " ");
		}
		System.out.print(newData[n-1]);
//		System.out.println(count(data, 0, 3));
		
		
		
	}
	
	public static int count(int[] data, int begin, int end){
		Set<Integer> set = new HashSet<Integer>();
		for(int i = begin+1; i < end; i++){
			
			set.add(data[i]);
		}
		return set.size();
	}
}
