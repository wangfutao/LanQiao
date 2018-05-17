package �㷨ѧϰ;

public class Dijkstra {
	public static void main(String[] args) {
		int inf = 10000;
		int start = 0;

		double[][] arr = { { 0, 1, 12, inf, inf, inf },
				{ inf, 0, 9, 3, inf, inf }, { inf, inf, 0, inf, 5, inf },
				{ inf, inf, 4, 0, 13, 15 }, { inf, inf, inf, inf, 0, 4 },
				{ inf, inf, inf, inf, inf, 0 } };

		double[] dis = new double[arr.length];
		boolean[] flag = new boolean[dis.length];

		for (int i = 0; i < dis.length; i++) {
			dis[i] = arr[start][i];
			flag[i] = false;
		}
		flag[0]  = true;

		double minDis = inf;
		int minIndex = 0;

		for (;;) {
			boolean finish = true;
			for(int j = 0; j < flag.length;j++){
				if(flag[j] == false){
					finish = false;
				}
			}
			if(finish){
				break;
			}
			
			minDis = inf;
			for (int j = 0; j < dis.length; j++) {
				if (!flag[j] && dis[j] < inf) {
					minDis = dis[j];
					minIndex = j;
				}
			}
			flag[minIndex] = true;
			for(int j = 0; j < dis.length; j++){
				if(arr[minIndex][j] < inf){
					if(dis[minIndex] + arr[minIndex][j] < dis[j]){
						dis[j] = dis[minIndex] + arr[minIndex][j];
					}
				}
			}
		}
		
		showArr(dis);
	}

	public static void showArr(double[] arr) {
		for (double n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void showArr(double[][] arr) {
		for (double[] n : arr) {
			for (double k : n) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}
}
