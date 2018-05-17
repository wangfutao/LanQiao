
public class AAABBB≈≈¡– {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(f(2, 2));

	}
	public static int f(int m, int n){
		if(m == 0 || n == 0){
			return 1;
		}
		return  f(m-1, n) + f(m, n-1);
	}

}
