
public class Æ¡¾ÆºÍÒûÁÏ {
	public static void main(String[] args) {
		int a, b;
		
		
		for(a = 0; a < 82.3 / 2.3; a++){
			for(b = a+1; b < 82.3/1.9 ;b++){
				if(equeal(a*2.3 + b*1.9, 82.3)){
					System.out.println(a);
					return;
				}
				
			}
		}
	}
	
	public static boolean equeal(double a, double b){
		
		if(Math.abs(a-b) < 0.0000001){
			return true;
		}
		return false;
	}
}
