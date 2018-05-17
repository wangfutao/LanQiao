package 省赛;

public class 省赛A6 {
	public static void main(String[] args) {
		int count = 0;
		
		for(int a1 = 1; a1 <= 13; a1++){
			for(int a2 = 1; a2 <= 13; a2++){
				for(int a3 = 1; a3 <= 13; a3++){
					if(a1 + a2 != a3 || hasSame(new int[]{a1,a2,a3})){
						continue;
					}
					for(int a4 = 1; a4 <= 13; a4++){
						for(int a5 = 1; a5 <= 13; a5++){
							for(int a6 = 1; a6 <= 13; a6++){
								if(a4 - a5 != a6 || hasSame(new int[]{a1,a2,a3,a4,a5,a6})){
									continue;
								}
								for(int a7 = 1; a7 <= 13; a7++){
									for(int a8 = 1; a8 <= 13; a8++){
										for(int a9 = 1; a9 <= 13; a9++){
											if(a7 * a8 != a9 || hasSame(new int[]{a1,a2,a3,a4,a5,a6,a7,a8,a9})){
												continue;
											}
											for(int a10 = 1; a10 <= 13; a10++){
												for(int a11 = 1; a11 <= 13; a11++){
													for(int a12 = 1; a12 <= 13; a12++){
														if(a11 * a12 != a10 || hasSame(new int[]{a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12})){
															continue;
														}
														count++;
														
														System.out
														.println(a1+"+"+a2+"="+a3);
														System.out
														.println(a4+"-"+a5+"="+a6);
														System.out
														.println(a7+"*"+a8+"="+a9);

														System.out
														.println(a10+"/"+a11+"="+a12);
														System.out
																.println("---------------------------");
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
			}
		}
		System.out.println(count);
	}	
	
	public static boolean hasSame(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = i +1; j < arr.length; j++){
				if(arr[j] == arr[i])
					return true;
			}
		}
		return false;
	}
}
