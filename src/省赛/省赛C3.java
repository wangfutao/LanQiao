package 省赛;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class 省赛C3 {
	public static void main(String[] args) {
		int n = 15684548;
		for(int i = 0; i < 10000; i++){
			
			n = f(n);
			System.out.println(n);
		}
		
		
	}
	
	public static int f(int n){
		int sum = 0;
		//102
		while(true){
			int t = n % 10;
			n = n / 10;
			sum += t*t;
			if(n == 0){
				break;
			}
			
		}
		return sum;
	}
}
