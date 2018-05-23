package 决赛;

import java.util.Scanner;

public class 决赛_6_B4穿越雷区 {
	static boolean[][] vis; 
	static int min = 1000000000;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0, y = 0;
		vis = new boolean[n+2][n+2];
		
		char[][] arr = new char[n+2][n+2];
		
		for(int j = 0; j < n+2; j++){
			arr[0][j] = '0';
			arr[n+1][j] = '0';
		}
		
		for(int i = 0; i < n+2; i++){
			arr[i][0] = '0';
			arr[i][n+1] = '0';
		}
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				String t = sc.next();
				arr[i][j] = t.charAt(0);
				if(arr[i][j] == 'A'){
					x = i;
					y = j;
				}
				
			}
		}
//		for(int i = 0; i < n+2; i++){
//			for(int j = 0; j < n+2; j++){
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
					
		dfs(0, arr, x, y);
		System.out.println(min);

	}
	public static void dfs(int count, char[][] arr, int x, int y){
		
		if(count >= min){
			return;
		}
		
		
		if(arr[x][y] == 'B'){
			if(count < min){
				min = count;
			}
			return;
		}
		
		
		vis[x][y] = true;
		if(arr[x+1][y] != arr[x][y] && !vis[x+1][y] && arr[x+1][y] != '0'){
			dfs(count+1, arr, x+1, y);
		}
		if(arr[x-1][y] != arr[x][y] && !vis[x-1][y] && arr[x-1][y] != '0'){
			dfs(count+1, arr, x-1, y);
		}
		if(arr[x][y+1] != arr[x][y] && !vis[x][y+1] && arr[x][y+1] != '0'){
			dfs(count+1, arr, x, y+1);
		}
		if(arr[x][y-1] != arr[x][y] && !vis[x][y-1] && arr[x][y-1] != '0'){
			dfs(count+1, arr, x, y-1);
		}
		vis[x][y] = false;
	}
}
