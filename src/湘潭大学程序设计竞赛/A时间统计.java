package 湘潭大学程序设计竞赛;

import java.util.Date;
import java.util.Scanner;

public class A时间统计 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int n;
		 n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String str1;
			String str2;
			str1 = sc.next();
			str2 = sc.next();
			Date date = new Date();
			long nowTime = date.getTime();
			
			String[] arr1 = str1.split(":");
			int d = Integer.parseInt(arr1[0].split("day")[0]);
			int h = Integer.parseInt(arr1[0].split("day")[1]);
			int m = Integer.parseInt(arr1[1]);
			int s = Integer.parseInt(arr1[2]);
			long now = nowTime + d * (3600 * 24) + h * 3600 + m * 60 + s;

			String[] arr2 = str2.split(":");
			int d2 = Integer.parseInt(arr2[0].split("day")[0]);
			int h2 = Integer.parseInt(arr2[0].split("day")[1]);
			int m2 = Integer.parseInt(arr2[1]);
			int s2 = Integer.parseInt(arr2[2]);

			long end = nowTime + d2 * (3600 * 24) + h2 * 3600 + m2 * 60 + s2;

			System.out.println(end - now);
		}
	}
}
