
public class ·´×ª×Ö·û´® {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "12345";
		String s2 = f(s1);
		System.out.println(s2);
	}
	public static String f(String x){
		if(x == null || x.length() < 2){
			return x;
		}
		
		return f(x.substring(1)) + x.charAt(0);
	}

}
