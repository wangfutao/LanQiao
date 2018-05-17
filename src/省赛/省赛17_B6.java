package 省赛;
public class 省赛17_B6 {
	static int f(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		int[][] a = new int[c1.length + 1][c2.length + 1];

		int max = 0;
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j++) {
				if (c1[i - 1] == c2[j - 1]) {
					a[i][j] = a[i-1][j-1]+1; // 填空
					if (a[i][j] > max)
						max = a[i][j];
				}
			}
		}

		return max;
	}
	//abcdk
	//aabcda
	
	/*
  a:
	{0,0,0,0,0,0,0}
	{0,1,1,0,0,0,1}
	{0,0,0,0,0,0,0}
	{0,0,0,0,0,0,0}
	{0,0,0,0,0,0,0}
	{0,0,0,0,0,0,0}
	
	*/
	public static void main(String[] args) {
		int n = f("abcdkkk", "baabcdkadabc");
		System.out.println(n);
	}
}
