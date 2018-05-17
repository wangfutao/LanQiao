package 湘潭大学程序设计竞赛;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class H统计颜色 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		
		for(int i = 0; i < n; i++){
			list.add(new HashSet<Integer>());
		}
//		sc.next();
		for(int i = 0; i <= m; i++){
			String str;
			//str = sc.next();
			str = sc.nextLine();
			String[] arr = str.split(" ");
			String ctrl = arr[0];
		
			//System.out.println(str);
			
			if(ctrl.equals("1")){
				int l,r,c;
				l = Integer.parseInt(arr[1]) - 1;
				r = Integer.parseInt(arr[2]) - 1;
				c = Integer.parseInt(arr[3]);
				for(int k = l; k <= r; k++){
					list.get(k).add(c);
				}
			}else if(ctrl.equals("2")){
				int l,r;
				l = Integer.parseInt(arr[1]) - 1;
				r = Integer.parseInt(arr[2]) - 1;
				
				Set<Integer> colors = new HashSet<Integer>();
				for(int k = l; k <= r; k++){
					for(int color:list.get(k)){
						colors.add(color);
					}
				}
				System.out.println(colors.size());
			}
		}
	}
}
