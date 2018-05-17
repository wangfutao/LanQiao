public class dfs_振兴中华 {
	static int count = 0;

	public static void main(String[] args) {
		char[][] arr = { 
				"从我做起振".toCharArray(),
				"我做起振兴".toCharArray(),
				"做起振兴中".toCharArray(),
				"起振兴中华".toCharArray()};

		dfs(arr, 0, 0);

		System.out.println(count);
	}

	public static void dfs(char[][] arr, int x, int y) {
		if (arr[x][y] == '华') {
			count++;
			
			return;
		}
		
		if (x >= 0 && x < 3) {
			dfs(arr, x + 1, y);
		}
		if (y >= 0 && y < 4) {
			dfs(arr, x, y + 1);
		}
	}
}
