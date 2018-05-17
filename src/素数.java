
public class ËØÊı {
	public static void main(String[] args) {
		int begin = 2;
		int end = 100;
		
		for(int i = begin; i <= end; i++){
			if(isSuShu(i)){
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isSuShu(int num){
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}
