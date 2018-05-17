package 省赛;
public class 省赛B3 {

	
	public static void main(String[] args) {
		
		int count = 0;
		
		int A,B,C,D,G;
		
		for(int i = 1; i <= 9; i++){
		
			A = i;
			for(int j = 1; j <= 9; j++){
				if(j == i){
					continue;
				}
				
				C = j;
				for(int k = 1; k <= 9; k++){
					if(k == i || k == j){
						continue;
					}
					
					B = k;
					for(int g = 1; g <=9; g++){
						if(g == i || g == j || g == k){
							continue;
						}
						for(int h = 1; h <=9; h++){
							if(h == i || h == j || h == k || h == g){
								continue;
							}
							for(int i1 = 1; i1 <=9; i1++){
								if(i1 == i || i1 == j || i1 == k || i1 == g || i1 == h){
									continue;
								}
								G = g*100 + h*10 + i1;
								for(int d = 1; d <= 9; d++){
									if(d == i || d == j || d == k || d == g || d == h || d== i1){
										continue;
									}
									for(int e = 1; e <= 9; e++){
										if(e == i || e == j || e == k || e == g || e == h || e == i1 || e == d){
											continue;
										}

										for(int f = 1; f <= 9; f++){
											if(f == i || f == j || f == k || f == g || f == h || f == i1 || f == d || f == e){
												continue;
											}
											D = d*100 + e*10 + f;
											
											if(A*C*G + B*G + C*D == 10*C*G){
												count++;
											}
											
										}
									}
								}
								
							}
						}
					}
				}
			}
		}
		
		System.out.println(count);
		
	}
	


}
