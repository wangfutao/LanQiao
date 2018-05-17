package 省赛;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 省赛17_B3 {
	public static void main(String[] args) {
		String str = 
					                "7 \n"+
				                   "5 8 \n"+
				                  "7 8 8 \n"+
				                 "9 2 7 2 \n"+
				                "8 1 4 9 1 \n"+
				               "8 1 8 8 4 1 \n"+
				              "7 9 6 1 4 5 4 \n"+
				             "5 6 5 5 6 9 5 6 \n"+
				            "5 5 4 7 9 3 5 5 1 \n"+
				           "7 5 7 9 7 4 7 3 3 1 \n"+
				          "4 6 4 5 5 8 8 3 2 4 3 \n"+
				         "1 1 3 3 1 6 6 5 5 4 4 2 \n"+
				        "9 9 9 2 1 9 1 9 2 9 5 7 9 \n"+
				       "4 3 3 7 7 9 3 6 1 3 8 8 3 7 \n"+
				      "3 6 8 1 5 3 9 5 8 3 8 1 8 3 3 \n"+
				     "8 3 2 3 3 5 5 8 5 4 2 8 6 7 6 9 \n"+
				    "8 1 8 1 8 4 6 2 2 1 7 9 4 2 3 3 4 \n"+
				   "2 8 4 2 2 9 9 2 8 3 4 9 6 3 9 4 6 9 \n"+
				  "7 9 7 4 9 7 6 6 2 8 9 4 1 8 1 7 2 1 6 \n"+
				 "9 2 8 6 4 2 7 9 5 4 1 2 5 1 7 3 9 8 3 3 \n"+
				"5 2 1 6 7 9 3 2 8 9 5 5 6 6 6 2 1 8 7 9 9 \n"+
			   "6 7 1 8 8 7 5 3 6 5 4 7 3 4 6 7 8 1 3 2 7 4 \n"+
			  "2 2 6 3 5 3 4 9 2 4 5 7 6 6 3 2 7 2 4 8 5 5 4 \n"+
			 "7 4 4 5 8 3 3 8 1 8 6 3 2 1 6 2 6 4 6 3 8 2 9 6 \n"+
		    "1 2 4 1 3 3 5 3 4 9 6 3 8 6 5 9 1 5 3 2 6 8 8 5 3 \n"+
		   "2 2 7 9 3 3 2 8 6 9 8 4 4 9 5 8 2 6 3 4 8 4 9 3 8 8 \n"+
		  "7 7 7 9 7 5 2 7 9 2 5 1 9 2 6 5 3 9 3 5 7 3 5 4 2 8 9 \n"+
		 "7 7 6 6 8 7 5 5 8 2 4 7 7 4 7 2 6 9 2 1 8 2 9 8 5 7 3 6 \n"+
		"5 9 4 5 5 7 5 5 6 3 5 3 9 5 8 9 5 4 1 2 6 1 4 3 5 3 2 4 1 ";
		
		int[][] arr= new int[29][29];

		int i = 0;
		for(String s:str.split("\n")){		
			int j = 0;
			for(String t:s.split(" ")){
				if(!t.equals("") && t!= null){
					arr[i][j++] = Integer.parseInt(t);
				}
				
			}
			i++;
			
		}
		
		double[][] weight = new double[30][30];
		
		for(i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				weight[i][j] = arr[i][j];
			}
		}
		for(i = 1; i < weight.length; i++){
			for(int j = 0; j < weight[i].length; j++){
				if(j == 0){
					weight[i][j] = weight[i][j] + weight[i-1][j]*1.0/2;// + weight[i-1][j+1]*1.0/2;
				} else{
					weight[i][j] = weight[i][j] + weight[i-1][j]*1.0/2 + weight[i-1][j-1]*1.0/2;
				}
				
				
			}
		}	
		for(i = 0; i < weight.length; i++){
			for(int j = 0; j < weight[i].length; j++){
				System.out.print(weight[i][j] + " ");
				
				
			}
			System.out.println();
		}
		
		List<Double> list = new ArrayList<Double>();
		for( i = 0; i < weight[29].length; i++){
			list.add(weight[29][i]);
		}
		Collections.sort(list);
		double min = list.get(0);
		double max = list.get(list.size()-1);
		System.out.println(min+"   "+max);
		double x = 2086458231.0/min;
		//System.out.println(max * x);
		BigDecimal num = new BigDecimal(max*x);
		System.out.println(num);
		
	}
}
