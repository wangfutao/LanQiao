import java.util.Scanner;

public class 递归整数划分 {
	public static void main(String[] args) {
		int n = 6;
		// Scanner sc = new Scanner(System.in);
		// n = sc.nextInt();
		int[] a = new int[n];
		f(n, a, 0);
	}

	public static void f(int n, int[] a, int k) {
		if(n <= 0){
			for(int i = 0; i < k-1; i++){
				System.out.print(a[i] + "+");
			}
			System.out.println(a[k-1]);
			
			return;
		}
		for (int i = n; i > 0; i--) {
			if(k > 0 && i > a[k-1]){
				continue;
			}
			a[k] = i;
			f(n - i, a, k + 1);
		}
	}
}
