package 省赛;

public class 省赛B5 {
	public static void f(int[] a, int k, int n, String s)
	{
		
		if(k==a.length){ 
			if(n==0) System.out.println(s);
			return;
		}
		
		String s2 = s;
		for(int i=0; i<=a[k]; i++){
			//_____________________________;   //填空位置
			f(a,k+1,n-i,s2);
			s2 += (char)(k+'A');
		}
	}
	
	public static void main(String[] args)
	{
		int[] a = {4,2,2,1,1,3};
		
		f(a,0,5,"");
	}
}
