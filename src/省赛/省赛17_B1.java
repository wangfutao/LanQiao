package ʡ��;
import java.util.ArrayList;
import java.util.List;


public class ʡ��17_B1 {
	public static void main(String[] args) {
		String str = 	"****     180.90       88��\n"+
						"****      10.25       65��\n"+
						"****      56.14        9��\n"+
						"****     104.65        9��\n"+
						"****     100.30       88��\n"+
						"****     297.15        ���\n"+
						"****      26.75       65��\n"+
						"****     130.62        ���\n"+
						"****     240.28       58��\n"+
						"****     270.62        8��\n"+
						"****     115.87       88��\n"+
						"****     247.34       95��\n"+
						"****      73.21        9��\n"+
						"****     101.00        ���\n"+
						"****      79.54        ���\n"+
						"****     278.44        7��\n"+
						"****     199.26        ���\n"+
						"****      12.97        9��\n"+
						"****     166.30       78��\n"+
						"****     125.50       58��\n"+
						"****      84.98        9��\n"+
						"****     113.35       68��\n"+
						"****     166.57        ���\n"+
						"****      42.56        9��\n"+
						"****      81.90       95��\n"+
						"****     131.78        8��\n"+
						"****     255.89       78��\n"+
						"****     109.17        9��\n"+
						"****     146.69       68��\n"+
						"****     139.33       65��\n"+
						"****     141.16       78��\n"+
						"****     154.74        8��\n"+
						"****      59.42        8��\n"+
						"****      85.44       68��\n"+
						"****     293.70       88��\n"+
						"****     261.79       65��\n"+
						"****      11.30       88��\n"+
						"****     268.27       58��\n"+
						"****     128.29       88��\n"+
						"****     251.03        8��\n"+
						"****     208.39       75��\n"+
						"****     128.88       75��\n"+
						"****      62.06        9��\n"+
						"****     225.87       75��\n"+
						"****      12.89       75��\n"+
						"****      34.28       75��\n"+
						"****      62.16       58��\n"+
						"****     129.12        ���\n"+
						"****     218.37        ���\n"+
						"****     289.69        8��\n";
		
		
		String[] strs = str.split("\n");
		
		List<String[]> tList = new ArrayList<String[]>();
		
		for(String s:strs){
			String[] t = s.split(" ");
			String[] good = new String[3];
			int index = 0;
			for(String s1:t){
				if(!s1.equals("") && s1 != null){
					s1 = s1.replace("���", "5");
					s1 = s1.replace("��", "");
					good[index++] = s1;
				}
			}
			tList.add(good);
		}

		
		List<double[]> list = new ArrayList<double[]>();
		
		for(String[] t:tList){
			
			double price = Double.parseDouble(t[1]);
			double zhe = Double.parseDouble(t[2]);
			if(zhe > 10){
				zhe = zhe/10;
			}
			zhe = zhe / 10;
			list.add(new double[]{price,zhe});
		}
		
		double sum = 0;
		
		for(double[] t:list){
			sum += t[0]*t[1];
		}
		System.out.println(sum);
		
		
	}
}
