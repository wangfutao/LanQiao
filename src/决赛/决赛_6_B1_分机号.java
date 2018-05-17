package 决赛;

public class 决赛_6_B1_分机号 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 9; i >= 2; i--){
			for(int j = 8; j >= 1; j--){
				if(j >= i){
					continue;
				}
				for(int k = 7; k >= 0; k--){					
					if(i > j && j > k){
//						/System.out.println(i+"-"+j+"-"+k);
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
