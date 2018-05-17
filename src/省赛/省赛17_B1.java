package й║хЭ;
import java.util.ArrayList;
import java.util.List;


public class й║хЭ17_B1 {
	public static void main(String[] args) {
		String str = 	"****     180.90       88уш\n"+
						"****      10.25       65уш\n"+
						"****      56.14        9уш\n"+
						"****     104.65        9уш\n"+
						"****     100.30       88уш\n"+
						"****     297.15        ╟К╪ш\n"+
						"****      26.75       65уш\n"+
						"****     130.62        ╟К╪ш\n"+
						"****     240.28       58уш\n"+
						"****     270.62        8уш\n"+
						"****     115.87       88уш\n"+
						"****     247.34       95уш\n"+
						"****      73.21        9уш\n"+
						"****     101.00        ╟К╪ш\n"+
						"****      79.54        ╟К╪ш\n"+
						"****     278.44        7уш\n"+
						"****     199.26        ╟К╪ш\n"+
						"****      12.97        9уш\n"+
						"****     166.30       78уш\n"+
						"****     125.50       58уш\n"+
						"****      84.98        9уш\n"+
						"****     113.35       68уш\n"+
						"****     166.57        ╟К╪ш\n"+
						"****      42.56        9уш\n"+
						"****      81.90       95уш\n"+
						"****     131.78        8уш\n"+
						"****     255.89       78уш\n"+
						"****     109.17        9уш\n"+
						"****     146.69       68уш\n"+
						"****     139.33       65уш\n"+
						"****     141.16       78уш\n"+
						"****     154.74        8уш\n"+
						"****      59.42        8уш\n"+
						"****      85.44       68уш\n"+
						"****     293.70       88уш\n"+
						"****     261.79       65уш\n"+
						"****      11.30       88уш\n"+
						"****     268.27       58уш\n"+
						"****     128.29       88уш\n"+
						"****     251.03        8уш\n"+
						"****     208.39       75уш\n"+
						"****     128.88       75уш\n"+
						"****      62.06        9уш\n"+
						"****     225.87       75уш\n"+
						"****      12.89       75уш\n"+
						"****      34.28       75уш\n"+
						"****      62.16       58уш\n"+
						"****     129.12        ╟К╪ш\n"+
						"****     218.37        ╟К╪ш\n"+
						"****     289.69        8уш\n";
		
		
		String[] strs = str.split("\n");
		
		List<String[]> tList = new ArrayList<String[]>();
		
		for(String s:strs){
			String[] t = s.split(" ");
			String[] good = new String[3];
			int index = 0;
			for(String s1:t){
				if(!s1.equals("") && s1 != null){
					s1 = s1.replace("╟К╪ш", "5");
					s1 = s1.replace("уш", "");
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
