package 算法学习;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 高度差 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double h = 0;
		while(n-- != 0){
			int a = sc.nextInt();
			int d = sc.nextInt();
			if(a != 0){
				h += d*sin(a);
			}
		}
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(h));
	}
	
	/**
	 * 计算sin
	 * @param deg
	 * @return
	 */
	public static double sin(int deg){
		return Math.sin(degToRad(deg));
	}
	/**
	 * 度数转为弧度数
	 * @param deg
	 * @return
	 */
	public static double degToRad(int deg){
		return Math.PI * (deg*1.0 / 180);
	}
}
