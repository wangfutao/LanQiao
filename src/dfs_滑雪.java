import java.util.ArrayList;
import java.util.List;

public class dfs_»¬Ñ© {
	static int[][] visit;
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		int[][] arr = { 
				{ 1,  2,  3,  4,  5 }, 
				{ 16, 17, 18, 19, 6 },
				{ 15, 24, 25, 20, 7 },
				{ 14, 23, 22, 21, 8 },
				{ 13, 12, 11, 10, 9 } };
		visit = new int[arr.length][arr[0].length];
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				list.clear();
				dfs(arr, i, j, list);
			}
		}
		
	}
	
	public static void dfs(int[][] arr, int x, int y, List<Integer> list){
		
		if(visit[x][y] == 1){
			return;
		}
		
		
		if(arr[x+1][y] < arr[x][y]){
			dfs(arr,x+1,y,list);
		}
		if(arr[x-1][y] < arr[x][y]){
			
		}
	}
}
