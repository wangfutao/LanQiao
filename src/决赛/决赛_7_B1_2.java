package 决赛;
public class 决赛_7_B1_2 {
	public static void main(String[] args) throws InterruptedException {

		double a = 0;
		double b = 1000;
		double c = a;
		double s_a = 10.0/1000;
		double s_b = 10.0/1000;
		double s_c = 50.0/1000;
		int count = 0;
		int direc = 1;
		
		while (true) {

			Thread.sleep(1);
			a += s_a;
			b -= s_b;
			if(direc == 1){
				c += s_c;				
				if(Math.abs(c-b) < 0.1){
					direc = 0;
					count++;
				}
			}else{
				c -= s_c;
				if(Math.abs(c-a) < 0.1){
					direc = 1;
				}
			}
			
			
			if(( b - a) <= 1){
				break;
			}
			
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(count);
	}
}
