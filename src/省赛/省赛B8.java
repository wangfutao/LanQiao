package ʡ��;
import java.util.Scanner;


public class ʡ��B8 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		long startTime = System.currentTimeMillis();
		int t = (int)Math.sqrt(n);
		for(int i = 0; i <= t ; i++){
			for(int j = i; j <= t ; j++){
				for(int k = j; k <= t ; k++){
					for(int m = k; m <= t ; m++){
						if(i*i+j*j+k*k+m*m == n){
							System.out.println(i+" "+j+" "+k+" "+m);
							
							return;
						}
					}
				}
			}
		}
	}
}
