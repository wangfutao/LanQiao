package 省赛;

public class 省赛B1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int s = 0;
		int k = 1;
		for(int i = 1; i <= 100; i++){
			s += k;
			k += (i+1);
		}
		System.out.println(s);
	}

}
