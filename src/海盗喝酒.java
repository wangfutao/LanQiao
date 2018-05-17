
public class º£µÁºÈ¾Æ {
	public static void main(String[] args) {
		for(int n = 1; n <= 20; n++){
			for(int n2 = 1; n2 < n; n2++){
				for(int n3 = 1; n3 < n2; n3++){
					for(int n4 = 1; n4 < n3; n4++){
//						System.out.println(1.0/n + 1.0/n2 + 1.0/n3 + 1.0/n4);
						if(Math.abs((1.0/n + 1.0/n2 + 1.0/n3 + 1.0/n4) - 1.0) < 0.0000001){
							System.out.println(n+" " + n2 + " " + n3 + " " +n4 + " 0");
						}
					}
				}
			}
		}
	}
}
