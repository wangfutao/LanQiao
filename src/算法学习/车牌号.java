package �㷨ѧϰ;

import java.util.Scanner;

public class ���ƺ� {
	public static void main(String[] args) {
		
		int[] arr = new int[10000];  //�������
		int len = 0;
		//����2~9999֮�������
		for (int i = 2; i <= 9999; i++) {
			if (isPrim(i)) {
				arr[len++] = i;
			}
		}
		//��arr�е�����д������  �Ա�ѭ����  ����[2,3,5,7] ��Ϊ  [2,3,5,7,2,3,5,7]
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

			int num = Integer.parseInt(str.split(" ")[1]);  //��ȡ����
			String pre = str.split(" ")[0];  //��ȡǰ��������ĸ
			
			//�����ǰ���ֲ��������һ������   ���øı���ĸ�����ָ�Ϊ��ǰ����һ������
			if (num < arr[len - 1]) {
				for (int i = 0; i < len; i++) {
					if(arr[i] >= num){
						num = arr[i];
						break;
					}
				}
			}else{ 
				//�����ǰ���ֳ��������һ��������������Ϊ2   ���һ����ĸ��1
				num = 2;
				char c = pre.charAt(2);
				pre = pre.substring(0, 2);
				pre = pre + (char)(c+1);
			}
			
			//���ֲ���4λ�Ĳ�0
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
			
			//���
			System.out.println(pre+" "+strNum);
			
		}

	}

	/**
	 * �ж�����
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

