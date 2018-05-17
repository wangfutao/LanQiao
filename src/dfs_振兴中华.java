public class dfs_�����л� {
	static int count = 0;

	public static void main(String[] args) {
		char[][] arr = { 
				"����������".toCharArray(),
				"����������".toCharArray(),
				"����������".toCharArray(),
				"�������л�".toCharArray()};

		dfs(arr, 0, 0);

		System.out.println(count);
	}

	public static void dfs(char[][] arr, int x, int y) {
		if (arr[x][y] == '��') {
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
