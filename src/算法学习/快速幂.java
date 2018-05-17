package 算法学习;

public class 快速幂 {
	public static void main(String[] args) {
		int a = 23;
		int b = 56355;
		int p = 12125;
		int res;
		long start, end;

//		start = System.currentTimeMillis();
//		res = pow1(a, b, p);
//		end = System.currentTimeMillis();
//		System.out.println(res + "   use:" + (end - start) + "ms");

		start = System.currentTimeMillis();
		res = pow2(a, b, p);
		end = System.currentTimeMillis();
		System.out.println(res + "   use:" + (end - start) + "ms");

		start = System.currentTimeMillis();
		res = pow3(a, b, p);
		end = System.currentTimeMillis();
		System.out.println(res + "   use:" + (end - start) + "ms");

	}

	public static int pow1(int a, int b, int p) {
		int s = 1;
		a = a % p;
		for (int i = 0; i < b; i++) {
		  	s = (s % p * a) % p;
		}
		return s;
	}

	public static int pow2(int a, int b, int p) {
		a = a % p;
		int s = 1;
		while (b != 0) {
			if ((b & 1) == 1) {
				s = (s * a) % p;
			}
			b = b >> 1;
			a = (a * a) % p;
		}
		return s;
	}
	
	

	public static int pow3(int a, int b, int p){
		a = a%p;
		int s = 1;
		int count = 0;
		while(b != 0){
			if((b & 1) == 1){
				s = (s * a)%p;
			}
			
			a = (a * a)%p;
			
			b = b>>1;
			count++;
		}
		System.out.println("count:"+count);
		return s;
	}
}







