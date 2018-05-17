package �㷨ѧϰ;

public class ����С����_����ȡģ {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// ����С���� a^(p-1)%p = 1 pΪ����
		int a = 9;
		int p = 17;
		System.out.println("// ����С���� a^(p-1)%p = 1 pΪ����");
		System.out.println(Math.pow(a, p - 1) % p); // 1
		System.out.println("----");
		// (a+b)%c = ((a%c) + (b%c))%c
		// (a*b)%c = ((a%c) * (b%c))%c
		int b, c;
		a = 100;
		b = 1200;
		c = 67;
		System.out.println("// (a+b)%c = ((a%c) + (b%c))%c");
		System.out.println((a + b) % c);
		System.out.println((a % c + b % c) % c);
		System.out.println("----");
		System.out.println("(a*b)%c = ((a%c) * (b%c))%c");
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);

		System.out.println("----");
		// 쳲���������
		System.out.println("// 쳲���������");
		쳲���������();

		long end = System.currentTimeMillis();
		System.out.println("use:" + (end - start) + "ms");

	}

	public static void 쳲���������() {
		int n = 42000000;
		int p = 1000000007;
//		p = 17;
		int res;
		int _res; // (mod p)�Ľ��
		// res = fib(n);
		// System.out.println("res:"+res);
		// System.out.println(res%p);

		// _res = fib(n,p);
		// System.out.println(_res);

		System.out.println("----");
		System.out.println("//���õݹ�");
		// res = fib2(n);
		// System.out.println(res);
		long _start = System.currentTimeMillis();
		_res = fib2(n,p);
		long _end = System.currentTimeMillis(); 
		System.out.println(_res+"   use:"+(_end-_start)+"ms");
		_start = System.currentTimeMillis();
		_res = fib3(n, p);
		_end = System.currentTimeMillis(); 
		System.out.println(_res+"   use:"+(_end-_start)+"ms");
	}

	/**
	 * 쳲���������
	 * 
	 * @param n
	 * @return
	 */
	public static int fib(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

	/**
	 * 쳲��������� ����
	 * 
	 * @param n
	 * @param p
	 * @return
	 */
	public static int fib(int n, int p) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		return (fib(n - 1, p) % p + fib(n - 2, p) % p) % p;
	}

	/**
	 * ���õݹ�
	 * 
	 * @param n
	 * @return
	 */
	public static int fib2(int n) {
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 1;
		// arr[2] = 1;
		for (int i = 2; i < n + 1; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];

	}

	/**
	 * ���õݹ�
	 * 
	 * @param n
	 * @return
	 */
	public static int fib2(int n, int p) {
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 1;
		// arr[2] = 1;
		for (int i = 2; i < n + 1; i++) {
			arr[i] = (arr[i - 1] % p + arr[i - 2] % p) % p;
		}
		return arr[n];

	}
	
	/**
	 * ���õݹ�
	 * 
	 * @param n
	 * @return
	 */
	public static int fib3(int n, int p) {
		int a = 1;
		int b = 2;
		if(n == 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		int c = 0;
		for(int i = 3; i < n+1; i++){
			c = (a%p + b%p)%p;
			a = b;
			b = c;
		}
		return c;

	}
}
