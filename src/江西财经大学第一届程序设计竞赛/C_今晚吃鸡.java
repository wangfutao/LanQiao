package 江西财经大学第一届程序设计竞赛;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class C_今晚吃鸡 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double g = 9.8;
		int T = sc.nextInt();
		while(T-- != 0){
			double L,v1,v2;
			L = sc.nextDouble();
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			//System.out.println(L+" "+v1+" "+v2);
			DecimalFormat df = new DecimalFormat("0.000000");
			double t = L/(v1-v2);
			double h = 0.5*g*t*t;
			double L2 = v2*t;
			t = Double.parseDouble(df.format(t));
			h = Double.parseDouble(df.format(h));
			L2 = Double.parseDouble(df.format(L2));
			
			System.out.println(h+" "+L2);
		}
	}
	
}
