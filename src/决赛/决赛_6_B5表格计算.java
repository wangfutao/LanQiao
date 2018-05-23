package 决赛;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 决赛_6_B5表格计算 {
	static String[][] chart;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		chart = new String[n][m];
		// Input
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				chart[i][j] = sc.next();
			}
		}

		boolean isFinish = false;
		while (!isFinish) {
			
			isFinish = true;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (!isNum(chart[i][j])) {
						//System.out.print(chart[i][j]+"  --  ");
						if (!exec( i, j, chart[i][j])) {
							//System.out.println("false");
							isFinish = false;
						}else{
							//System.out.println("true");
						}

					}
				}
			}
		}

		// Output
		DecimalFormat df = new DecimalFormat("0.00");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m-1; j++) {
//				System.out.print(chart[i][j]+" ");
				System.out.print(df.format(Double.parseDouble(chart[i][j])) + " ");
			}
			
			System.out.println(df.format(Double.parseDouble(chart[i][m-1])));
//			System.out.println();
		}

	}

	public static boolean isNum(String str) {
		char ch = str.charAt(0);
		if (ch >= '0' && ch <= '9') {
			return true;
		}
		return false;
	}

	public static boolean exec(int x, int y, String cmd) {
		String res = null;

		String ctrl = cmd.substring(0, 3);
		String data = cmd.substring(3);
		String tData = data.substring(1, data.length() - 1);
		String[] ttData = tData.split(":");
		String start = ttData[0];
		String end = ttData[1];
		String[] tStart = start.split(",");
		String[] tEnd = end.split(",");
		int x1 = Integer.parseInt(tStart[0]) - 1;
		int y1 = Integer.parseInt(tStart[1]) - 1;
		int x2 = Integer.parseInt(tEnd[0]) - 1;
		int y2 = Integer.parseInt(tEnd[1]) - 1;
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				if (!isNum(chart[i][j])) {
					return false;
				}
			}
		}

		DecimalFormat df = new DecimalFormat("0.00");
		
		
		if (ctrl.equals("SUM")) {
			chart[x][y] = df.format(sum( x1, y1, x2, y2));
			return true;
		}

		if (ctrl.equals("AVG")) {
			chart[x][y] =  df.format(avg( x1, y1, x2, y2));
			return true;
		}

		if (ctrl.equals("STD")) {
			chart[x][y] =  df.format(std( x1, y1, x2, y2));
			return true;
		}

		return false;

	}

	public static double sum( int x1, int y1, int x2, int y2) {
		double sum = 0;
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				sum += Double.parseDouble(chart[i][j]);

			}
		}

		return sum;

	}

	public static double avg( int x1, int y1, int x2, int y2) {
		double sum = sum( x1, y1, x2, y2);
		int count = (x2 - x1 + 1) * (y2 - y1 + 1);
		double avg = sum / count;
		return avg;
	}

	public static double std( int x1, int y1, int x2, int y2) {
		double avg = avg( x1, y1, x2, y2);
		int count = (x2 - x1 + 1) * (y2 - y1 + 1);
		double sum = 0;
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				double num = Double.parseDouble(chart[i][j]);
				sum += (num - avg) * (num - avg);

			}
		}
		return sum / count;
	}
}
