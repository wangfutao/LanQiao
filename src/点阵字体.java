

public class µ„’Û◊÷ÃÂ {
	public static void main(String[] args) {
//		System.out.println(int2Str(5));
		String str = "4 0 4 0 4 0 4 32 -1 -16 4 32 4 32 4 32 4 32 4 32 8 32 8 32 16 34 16 34 32 30 -64 0 \n" + 
				"16 64 16 64 34 68 127 126 66 -124 67 4 66 4 66 -124 126 100 66 36 66 4 66 4 66 4 126 4 66 40 0 16 \n" + 
				"4 0 4 0 4 0 4 32 -1 -16 4 32 4 32 4 32 4 32 4 32 8 32 8 32 16 34 16 34 32 30 -64 0 \n" + 
				"0 -128 64 -128 48 -128 17 8 1 -4 2 8 8 80 16 64 32 64 -32 64 32 -96 32 -96 33 16 34 8 36 14 40 4 \n" + 
				"4 0 3 0 1 0 0 4 -1 -2 4 0 4 16 7 -8 4 16 4 16 4 16 8 16 8 16 16 16 32 -96 64 64 \n" + 
				"16 64 20 72 62 -4 73 32 5 16 1 0 63 -8 1 0 -1 -2 0 64 0 80 63 -8 8 64 4 64 1 64 0 -128 \n" + 
				"0 16 63 -8 1 0 1 0 1 0 1 4 -1 -2 1 0 1 0 1 0 1 0 1 0 1 0 1 0 5 0 2 0 \n" + 
				"2 0 2 0 7 -16 8 32 24 64 37 -128 2 -128 12 -128 113 -4 2 8 12 16 18 32 33 -64 1 0 14 0 112 0 \n" + 
				"1 0 1 0 1 0 9 32 9 16 17 12 17 4 33 16 65 16 1 32 1 64 0 -128 1 0 2 0 12 0 112 0 \n" + 
				"0 0 0 0 7 -16 24 24 48 12 56 12 0 56 0 -32 0 -64 0 -128 0 0 0 0 1 -128 3 -64 1 -128 0 0 \n";
		
		String[] arr = str.split("\n");
		int[][] num = new int[16][2];
		int i = 0;
		int j = 0;
		for(String s:arr) {
			for(String ss:s.split(" ")) {
				num[i][j] = Integer.parseInt(ss);
				j++;
				if(j == 2) {
					j = 0;
					i++;
				}
			}
			
			for(i = 0; i < 16; i++) {
				String a = int2Str(num[i][0]);
				String b = int2Str(num[i][1]);
				String t = a+b;
				t = t.replaceAll("1", "* ");
				t = t.replace("0", "  ");
				System.out.println(t);
				
	
			}
			i = 0;
			j = 0;
			System.out.println("------------------------------------------------");
//			break;
		}
	}
	
	public static String int2Str(int num) {
		String s = Integer.toBinaryString(num);
		if(num < 0) {
			return s.substring(s.length()-8, s.length());
		}
//		System.out.println(s.length());
		String t = s;
		for(int i = 0; i < (8 - t.length()); i++) {
			s = "0" + s;
		}
		return s;
	}
}
