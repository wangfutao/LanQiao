package 省赛;
import java.util.Scanner;

public class 省赛17_B7 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		
		
		str = sc.next();
		String[] s = str.split("/");
		String s1 = "";
		if(Integer.parseInt(s[0]) >= 0 && Integer.parseInt(s[0]) <= 59){
			s1 += "20"+s[0];
		}else if(Integer.parseInt(s[0]) >= 60 && Integer.parseInt(s[0]) <= 99){
			s1 += "19"+s[0];
		}
		s1 += ("-" + s[1]+"-"+s[2]);

		String s2 = "";
		if(Integer.parseInt(s[2]) >= 0 && Integer.parseInt(s[2]) <= 59){
			s2 += "20"+s[2];
		}else if(Integer.parseInt(s[2]) >= 60 && Integer.parseInt(s[2]) <= 99){
			s2 += "19"+s[2];
		}
		s2 += ("-" + s[0]+"-"+s[1]);
		

		String s3 = "";
		if(Integer.parseInt(s[2]) >= 0 && Integer.parseInt(s[2]) <= 59){
			s3 += "20"+s[2];
		}else if(Integer.parseInt(s[2]) >= 60 && Integer.parseInt(s[2]) <= 99){
			s3 += "19"+s[2];
		}
		s3 += ("-" + s[1]+"-"+s[0]);
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
