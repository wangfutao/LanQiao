package 省赛;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 省赛C8 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int max = 1;

		for (int i = n; i > 0; i--) {
			int t = i;
			while (true) {
				if (t % 2 == 0) {
					t = t / 2;
				} else {
					t = t * 3 + 1;
				}
				if (t > max) {
					max = t;
				}
				//System.out.println(t);
				if (t == 1) {
					break;
				}
			}
		}

		System.out.println(max);

	}
}
