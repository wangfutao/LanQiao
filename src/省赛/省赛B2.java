package 省赛;

public class 省赛B2 {
	public static void main(String[] args) {
		int sum;
		for(int i = 1; ; i++){
			sum = 0;
			for(int j = i; ; j++){
				sum += j;
				if(sum > 236){
					break;
				}
				if(sum == 236){
					System.out.println(i);
					return;
				}
			}
		}
	}
}
