package HomeWork;

public class hw1 {
//請設計一隻Java程式,計算12,6這兩個數值的和與積
//	static public void main(String[] args) {
//		int a = 12, b = 6, c = a+b, d = a*b;
//		System.out.println("12 + 6 = "+ c);
//		System.out.println("12 * 6 = "+ d);
//	}
//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
//	static public void main(String[] args) {
//		int a = 200, b = a/12, c = a%12;
//		System.out.println(a + "顆蛋共是" + b + "打" + c + "顆");
//	}
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
//	static public void main(String[] args) {
//		int a = 256559, b = a/60/60/24, c = a/60/60 - b*24, 
//			d = a/60 - b*24*60 - c*60, e = a%60;
//		System.out.println(a + "秒為" + b + "天" + c + "小時" + d + "分" + e + "秒");
//	}
//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
//	static public void main(String[] args) {
//	float a = 3.1415f, r = 5, b = r*r*a, c = 2*r*a;
//	System.out.println("半徑為5的圓面積 = " + b);
//	System.out.println("半徑為5的圓周長 = " + c);
//}
//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)
	static public void main(String[] args) {
	double a = 150000000, b = 0.02f, c = 10, d = a*Math.pow((1+b), c);
	System.out.println(d);
	}
//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
//	static public void main(String[] args) {
//	System.out.println(5+5);
//	System.out.println(5+'5');
//	System.out.println(5+"5");
//	}
}
