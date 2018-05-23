package �㷨ѧϰ;

import java.util.Random;

public class KMP {
	public static void main(String[] args) {
		
		String str = "123";
		
		
		String s = "JKLMNOPQRSTUVWXYZ12";
		
		long start = System.currentTimeMillis();
		
		boolean isExist = hasStr(str, s);
		
		System.out.println(isExist);
		System.out.println("use:"+(System.currentTimeMillis() - start)+"ms");
		
	}
	
	
	public static boolean hasStr(String str, String t){
		
		for(int i = 0; i < str.length()-t.length(); i++){
			int j = 0;
			for(; j < t.length(); j++){
				if(t.charAt(j) != str.charAt(i+j)){
					break;
				}
			}
			if(j == t.length()){
				return true;
			} 		}
		return false;
	}
	
	public static String getRandomStr(int n){
		String str = "";
		Random r = new Random();
		for(int i = 0; i < n; i++){
		
			str += (char)(r.nextInt(90-65)+65);
		}
		return str;
		
	}
}
