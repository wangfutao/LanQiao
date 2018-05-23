package 蓝桥练习;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 算法提高167_快乐司机 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] g = new int[n];
		int[] p = new int[n];
		for(int i = 0; i < n; i++){
			g[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(p[i]/g[i] < p[j]/g[j]){
					int tP = p[i];
					int tG = g[i];
					p[i] = p[j];
					p[j] = tP;
					g[i] = g[j];
					g[j] = tG;					         
				}
			}
		}
		

//		for(int i = 0; i < n; i++){
//			System.out.println(g[i]+"--"+p[i]);
//		}
		
		double sum = 0;
		for(int i = 0; i < n; i++){
			if(g[i] <= w){
				sum += p[i];
				w -= g[i];
			}
		}
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println(df.format(sum));
	}
}
