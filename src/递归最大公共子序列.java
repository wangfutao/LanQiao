
public class �ݹ���󹫹������� {	
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "absds";
		int len = f(str1, str2);
		System.out.println(len);
	}
	
	public static int f(String s1, String s2){
		
		if(s1.length() == 0 || s2.length() == 0){
			return 0;
		}
		
		if(s1.charAt(0) == s2.charAt(0)){
			return f(s1.substring(1), s2.substring(1)) + 1;
		}
		return Math.max(f(s1.substring(1), s2), f(s1, s2.substring(1)));
	}

}
