package 算法学习;

import java.util.Scanner;

public class 车牌号 {
	public static void main(String[] args) {
		
		int[] arr = new int[10000];  //存放素数
		int len = 0;
		//查找2~9999之间的素数
		for (int i = 2; i <= 9999; i++) {
			if (isPrim(i)) {
				arr[len++] = i;
			}
		}
		//将arr中的素数写成两份  以便循环用  比如[2,3,5,7] 改为  [2,3,5,7,2,3,5,7]
		int t = len;
		for (int i = 0; i < t; i++) {
			arr[len++] = arr[i];
		}

		Scanner sc = new Scanner(System.in);
		String str;
		while (true) {
			str = sc.nextLine();
			if (str.equals("END 0000")) {
				break;
			}

			int num = Integer.parseInt(str.split(" ")[1]);  //提取数字
			String pre = str.split(" ")[0];  //提取前面三个字母
			
			//如果当前数字不超过最后一个素数   则不用改变字母，数字改为当前或下一个素数
			if (num < arr[len - 1]) {
				for (int i = 0; i < len; i++) {
					if(arr[i] >= num){
						num = arr[i];
						break;
					}
				}
			}else{ 
				//如果当前数字超过了最后一个素数，则数字为2   最后一个字母加1
				num = 2;
				char c = pre.charAt(2);
				pre = pre.substring(0, 2);
				pre = pre + (char)(c+1);
			}
			
			//数字不足4位的补0
			String strNum = "";
			if(num < 10){
				strNum = "000"+num;
			}
			if(num > 10 && num < 100){
				strNum = "00"+num;
			}
			if(num > 100 && num < 1000){
				strNum = "0"+num;
			}
			if(num > 1000){
				strNum = ""+num;
			}
			
			//输出
			System.out.println(pre+" "+strNum);
			
		}

	}

	/**
	 * 判断素数
	 * @param n
	 * @return
	 */
	public static boolean isPrim(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

