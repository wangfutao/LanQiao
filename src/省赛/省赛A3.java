package 省赛;
public class 省赛A3 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int count = 0;

		for (int a0 = 0; a0 <= 9; a0++) {
			arr[0] = a0;

			for (int a1 = 0; a1 <= 9; a1++) {
				arr[1] = a1;
				if (a1 <= a0)
					continue;
				for (int a2 = 0; a2 <= 9; a2++) {
					arr[2] = a2;
					if (a2 <= a0 || a2 == a1)
						continue;
					for (int a3 = 0; a3 <= 9; a3++) {
						arr[3] = a3;
						if (a3 <= a1 || a3 == a2 || a3 == a0)
							continue;
						for (int a4 = 0; a4 <= 9; a4++) {
							arr[4] = a4;
							if (a4 <= a2 || a4 == a3 || a4 <= a1 || a4 == a0)
								continue;
							for (int a5 = 0; a5 <= 9; a5++) {
								arr[5] = a5;
								if (a5 <= a2 || a5 == a4 || a5 == a3
										|| a5 == a1 || a5 == a0)
									continue;

								for (int a6 = 0; a6 <= 9; a6++) {
									arr[6] = a6;
									if (a6 <= a3 || a6 == a4 || a6 == a5
											|| a6 == a1 || a6 == a2 || a6 == a0)
										continue;
									for (int a7 = 0; a7 <= 9; a7++) {
										arr[7] = a7;
										if (a7 <= a3 || a7 <= a4 || a7 == a6
												|| a7 == a5 || a7 == a1
												|| a7 == a2 || a7 == a0)
											continue;
										/*
										 * 0 1 2 3 4 5 6 7 8 9
										 */
										for (int a8 = 0; a8 <= 9; a8++) {
											arr[8] = a8;
											if (a8 <= a4 || a8 <= a5
													|| a8 == a7 || a8 == a6
													|| a8 == a3 || a8 == a2
													|| a8 == a1 || a8 == a0)
												continue;
											for (int a9 = 0; a9 <= 9; a9++) {
												arr[9] = a9;
												if (a9 <= a5 || a9 == a8
														|| a9 == a7 || a9 == a6
														|| a9 == a4 || a9 == a3
														|| a9 == a2 || a9 == a1
														|| a9 == a0)
													continue;

												count++;

												System.out.println("    "+a0);
												System.out
														.println("   "+a1 + " " + a2);
												System.out.println("  "+a3 + " " + a4
														+ " " + a5);
												System.out.println(" "+a6 + " " + a7
														+ " " + a8 + " " + a9);
												System.out
														.println("------------------------");

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
/*
 * 0 1 2 3 4 5 6 7 8 9
 * 
 * 0 3 1 7 5 2 9 8 6 4
 * 
 * 0 1 2 3 4 5 6 7 8 9
 */