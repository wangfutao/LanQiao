package 北京师范大学第十六届程序设计竞赛决赛;

 import java.util.Scanner;

public class D {
	static int max = 2000000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		
		T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int n, m, k;
			n = sc.nextInt();
			m = sc.nextInt();
			k = sc.nextInt();
			int sum = n + m + k;
			int[][] arr = new int[sum * 2][sum * 2];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = max;
				}
				arr[i][i] = 0;
			}
			
			int[] yn = new int[n];
			int[] ym = new int[m];
			int[] yk = new int[k];
			for(int i = 0; i < n; i++){
				yn[i] = sc.nextInt();				
			}
			for(int i = 0; i < m; i++){
				ym[i] = sc.nextInt();				
			}
			for(int i = 0; i < k; i++){
				yk[i] = sc.nextInt();				
			}
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					arr[i][j] = Math.abs(yn[i] - yn[j]);
					arr[i+n][j+n] = Math.abs(yn[i] - yn[j]);
				}
				arr[i][i+n] = 1;
			}
			for(int i = n*2; i < n*2+m; i++){
				for(int j = n*2; j < n*2+m; j++){
					arr[i][j] = Math.abs(ym[i-n*2] - ym[j-n*2]);
					arr[i+m][j+m] = Math.abs(ym[i-n*2] - ym[j-n*2]);
				}
				arr[i][i+m] = 1;
			}
			for(int i = n*2+m*2; i < n*2+m*2+k; i++){
				for(int j = n*2+m*2; j < n*2+m*2+k; j++){
					arr[i][j] = Math.abs(yk[i-(n*2+m*2)] - yk[j-(n*2+m*2)]);
					arr[i+k][j+k] = Math.abs(yk[i-(n*2+m*2)] - yk[j-(n*2+m*2)]);
				}
				arr[i][i+k] = 1;
			}
			show(arr);
		}

	}

	public static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == max)
					System.out.print("M ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
