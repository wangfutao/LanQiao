package 江西财经大学第一届程序设计竞赛;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class B_大吉大利 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while((T--) != 0){
			String str = sc.next();
			str = str.replace("-", "/");
			Date date = new Date(str);			
			int start = (int) (date.getTime()/(24*3600*1000)) + 1;
			int end = (int) (new Date("2018/04/21").getTime()/(24*3600*1000))+1;
			int count = 0;
			for(int i = start; i <= end; i++){								
				Date t = new Date((long)(i) * (long)((24*3600*1000)));
				SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
				String s = format.format(t);
				//System.out.println(s);
				if(!s.contains("4")){
					count++;
				}

			}
			System.out.println(count);
		}
	}
}
