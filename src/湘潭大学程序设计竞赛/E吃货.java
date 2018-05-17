package 湘潭大学程序设计竞赛;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class E吃货 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;

		T = sc.nextInt();
		Random r = new Random();
		for (int k = 0; k < T; k++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();

			//List<int[]> goods = new ArrayList<int[]>();

			int[][] goods = new int[n][2];
			
			for (int i = 0; i < n; i++) {
//				int d = sc.nextInt();
//				int c = sc.nextInt();
				int d = r.nextInt(1000000000);
				int c = r.nextInt(1000000000);
				goods[i][0] = d;
				goods[i][1] = c;
				//goods.add(new int[] { d, c });
			}

			for (int i = 0; i < m; i++) {
//				int t = sc.nextInt();
				int t = r.nextInt(1000000000);
				int max = 0;
				for(int[] good:goods){
					if(good[1] > max && t >= good[0]){
						max = good[1];
					}
				}
				System.out.println(max);
			}
			
		}
	}
}
