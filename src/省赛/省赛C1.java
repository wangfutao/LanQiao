package 省赛;

public class 省赛C1 {
	public static void main(String[] args) {
		int sum = 777;
		char[] arr = "vxvxvxvxvxvxvvx".toCharArray();
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 'v'){
				sum *= 2;
			}else{
				
				sum -= 555;
				if(sum < 0){
					sum = 0;
				}
			}
		}
		System.out.println(sum);
	}
}
