
public class 最大公约数和最小公倍数 {
	public static void main(String[] args) {
		System.out.println(gcd(9,6));
		System.out.println(gongYueShu(9,6));
		
		System.out.println(gbd(9,5));
		System.out.println(gongBeiShu(9,6));
		
	}
	
	public static int gcd(int a, int b){
		if( a == 0){
			return b;
		}
		return gcd(b%a, a);
	}
	
	
	public static int gbd(int a, int b){
		return a*b/gcd(a,b);
	}
	
	public static int gongYueShu(int a, int b){
		for(int i = a; i >= 1; i--){
			if(a % i == 0 && b % i == 0){
				return i;
			}
		}
		return 1;
	}
	
	public static int gongBeiShu(int a, int b){
		int max = a>b?a:b;
		int min = a<b?a:b;
		int s = 1;
		for(int i = 1;i <= min;i++){
			s = max * i;
			if(s % a == 0 && s % b == 0){
				break;
			}
			
		}
		return s;
		
	}
}
