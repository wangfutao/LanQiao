package 决赛;

public class 决赛_7_B2_2 {
	public static void main(String[] args) {
		int count = 0;
		for(int a1 = 1; a1 <= 9; a1++){
			for(int a2 = 1; a2 <= 9; a2++){
				if(a2 == a1)  continue;
				for(int a3 = 1; a3 <= 9; a3++){
					if(a3 == a1 || a3 == a2)  continue;
					int r1 = a1+a2+a3;
					for(int a4 = 1; a4 <= 9; a4++){
						if(a4 == a1 || a4  == a2 || a4 == a3)  continue;
						for(int a5 = 1; a5 <= 9; a5++){
							if(a5 == a1 || a5  == a2 || a5 == a3 || a5 == a4)  continue;
							for(int a6 = 1; a6 <= 9; a6++){
								if(a6 == a1 || a6  == a2 || a6 == a3 || a6 == a4 || a6 == a5)  continue;
								int r2 = a4+a5+a6;
								if(r1 == r2) continue;
								for(int a7 = 1; a7 <= 9; a7++){
									if(a7 == a1 || a7  == a2 || a7 == a3 || a7 == a4 || a7 == a5 || a7 == a6)  continue;
									int c1 = a1+a4+a7;
									if(c1 == r1 || c1 == r2) continue;
									for(int a8 = 1; a8 <= 9; a8++){
										if(a8 == a1 || a8  == a2 || a8 == a3 || a8 == a4 || a8 == a5 || a8 == a6 || a8 == a7)  continue;
										int c2 = a2+a5+a8;
										if(c2 == c1 || c2 == r1 || c2 == r2) continue;
										for(int a9 = 1; a9 <= 9; a9++){
											if(a9 == a1 || a9  == a2 || a9 == a3 || a9 == a4 || a9 == a5 || a9 == a6 || a9 == a7 || a9 == a8)  continue;
											int c3 = a3+a6+a9;
											int r3 = a7+a8+a9;
											int x1 = a1+a5+a9;
											int x2 = a3+a5+a7;
											if(c3 == c2 || c3 == c1 || c3 == r1 || c3 == r2 || c3 == r3 || r3 == r2 || r3 == r1 || r3 == c1 || r3 == c2 || x1 == r1 || x1 == r2 || x1 == r3 || x1 == c1 || x1 == c2 || x1 == c3 || x1 == x2 || x2 == r1 || x2 == r2 || x2 == r3 || x2 == c1 || x2 == c2 || x2 == c3) continue;
											
											System.out.println(a1+ " " + a2 + " "+ a3);
											System.out.println(a4+ " " + a5 + " "+ a6);
											System.out.println(a7+ " " + a8 + " "+ a9);
											System.out.println("--------------------------------");
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
		
		System.out.println(count/8);
	}
}
