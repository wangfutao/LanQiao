package 蓝桥练习;

import java.util.Scanner;

public class 历届试题9_大臣的旅费 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] D = new int[n+1][n+1];
		for(int i = 0; i < n-1; i++){
			int p = sc.nextInt();
			int q = sc.nextInt();
			int d = sc.nextInt();
			D[p][q] = d;
			D[q][p] = d;			
		}
		dfs(D, 1, 1, n);
		System.out.println("end");
	
	}
	public static void dfs(int[][] D, int k, int i, int n){
		if(i  >= n){
			return;
		}
		for(int j = 1; j < n+1; j++){
			if(D[k][j] != 0 && j != k){
				dfs(D, k, j ,n);
			}
		}
	}
}
