package 省赛;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class 省赛B7_e {
	public static void main(String[] args) {

		int count = 0;

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		List<String> list = new ArrayList<String>();
		
		for(int i1 = 0; i1 < 3; i1++){
			for(int j1 = 0; j1 < 4; j1++){
				int a = arr[i1][j1];
				for(int i2 = 0; i2 < 3; i2++){
					for(int j2 = 0; j2 < 4; j2++){
						int b = arr[i2][j2];
						if(!xiangLin(i1, j1, i2, j2) || b == a){
							continue;
						}
						
						for(int i3 = 0; i3 < 3; i3++){
							for(int j3 = 0; j3 < 4; j3++){
								
								int c = arr[i3][j3];
								if(!xiangLin(i3, j3, i2, j2) || c == a || c == b){
									continue;
								}
								
								for(int i4 = 0; i4 < 3; i4++){
									for(int j4 = 0; j4 < 4; j4++){
										int d = arr[i4][j4];
										if(!xiangLin(i3, j3, i4, j4) || d == a || d == b || d == c){
											continue;
										}
										
										for(int i5 = 0; i5 < 3; i5++){
											for(int j5 = 0; j5 < 4; j5++){
												
												int e = arr[i5][j5];
												if(!xiangLin(i5, j5, i4, j4)|| e == a || e == b || e == c || e == d){
													continue;
												}
												
//												System.out
//														.println(a+" "+b+" "+c+" "+d+" "+e);
												
												List<Integer> listInt = new ArrayList<Integer>();
												listInt.add(a);
												listInt.add(b);
												listInt.add(c);
												listInt.add(d);
												listInt.add(e);
												Collections.sort(listInt);
//												System.out
//														.println(listInt);
												
												StringBuilder s = new StringBuilder();
												s.append(listInt.get(0));
												s.append(listInt.get(1));
												s.append(listInt.get(2));
												s.append(listInt.get(3));
												s.append(listInt.get(4));
												list.add(s.toString());
												
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
		for(int i = 0; i < list.size(); i++){
			for(int j = i+1; j < list.size(); j++){
				if(list.get(i).equals(list.get(j))){
					list.remove(j);
					
					//break;
				}
			}
		}
		System.out.println(list.size());
	}

	public static boolean xiangLin(int i1,int j1,int i2,int j2) {

		if(i1 == i2){
			if(Math.abs((j1-j2)) == 1){
				return true;
			}
		}
		if(j1 == j2){
			if(Math.abs((i1-i2)) == 1){
				return true;
			}
		}
		return false;
	}
}
