import java.text.DecimalFormat;

public class 问卷调查 {
	public static void main(String[] args) {
		
		
		// 年龄
		double[] r1 = {15.79,47.37,7.89,21.05,7.89};
		
		f("1.请问您的年龄在下列哪个阶段？龄",r1);
		
		double[] r2 = {26.32, 52.63, 10.53, 10.53};
		f("2. 请问您目前的状态是？",r2);
		
		double[] r3 = {52.63, 47.37};
		f("3. 您在生活中有遇到过家用电器坏了找不到人维修的情况吗？",r3);
		
		double[] r4 = {10.53,31.58,57.89};
		f("4.您在家庭生活中会修理各类家用电器吗？",r4);

		double[] r5 = {28.95,71.05};
		f("5.您用过类似寻找修理店家的手机软件或者登陆过这样的网站吗",r5);
		

		double[] r6 = {57.89, 42.11};
		f("6.您有想过通过一款app手机软件或者网站去寻找修理店铺吗？",r6);
		

		double[] r7 = {76.32, 23.68};
		f("7.如果现在有一款这样的app手机软件或者网站，您愿意去登陆注册吗",r7);
		

		double[] r8 = {28.95, 31.58, 39.47};
		f("8.如果支付一定的保险费，保证一年内你家里所有电器的维修（除了需要更换零件或者设备的情况）你愿意支付吗？",r8);
		

		double[] r9 = {57.89,7.89,34.21};
		f("9. 你会对家中一些电器进行清洗吗？（比如：夏季时你会对家庭中的空调进行清洗）",r9);
		

		double[] r10 = {36.84,31.58,31.58};
		f("10.清洗时，您是否觉得麻烦，怕损坏物品，需要请一个专业的人员来进行彻底的专业的清洗？",r10);
		

		double[] r11 = {26.32, 42.11, 31.58};
		f("11.夏季多雷雨天气，电压不稳定会造成家用电器损毁，此时，你愿意购买一定的保障险还是听天由命？",r11);
		
		
		

	}
	public static void f(String name, double[] rate){
		int total = 235;
		DecimalFormat df = new DecimalFormat("0");
		double[] date = new double[rate.length];
		for (int i = 0; i < rate.length; i++) {
			date[i] =  (total * (rate[i]/100));
		}

		System.out.println(name);
		for (int i = 0; i < date.length; i++) {
			System.out.println(df.format(date[i]) + "\t" + (rate[i]) + "%");
		}
		System.out.println("----------------------------------------");
	}
}
