package HomeWork;

import java.util.Scanner;

public class hw5 {

//	請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
//	public static void main(String[] args) {
//		
//		hw5_1 rectangle = new hw5_1();
//		rectangle.problem1();
//
//	}
	
	
//	請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
//	public static void main(String[] args) {
//		
//		hw5_2 randAvg = new hw5_2();
//		randAvg.problem2();
//
//	}
	
	
//	利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳
//	public static void main(String[] args) {
//		
//		int[][] intArray = {
//				{1,6,3},
//				{9,5,2}
//		};
//		
//		double[][] doubleArray = {
//				{1.2,3.5,2.2},
//				{7.4,2.1,8.2}
//		};
//		
//		hw5_3 w = new hw5_3();
//		System.out.println(w.maxElment(intArray));
//		System.out.println(w.maxElment(doubleArray));
//	}
	
	
//	請設計一個類別MyRectangle：...
//	public static void main(String[] args) {
//		
//		double width, depth;
//		Scanner sc = new Scanner(System.in);
//		width = sc.nextDouble();
//		depth = sc.nextDouble();
//		MyRectangle a = new MyRectangle();
//		a.setWidth(width);
//		a.setDepth(depth);
//		System.out.println(a.getArea());
//	}
	
	
//	請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼
//	，此驗證碼內容包含了英文大小寫與數字的亂數組合
//	public static void main(String[] args) {
//		
//		hw5_5 captcha = new hw5_5();
//		captcha.problem5();
//		
//	}
	
	
//	建立父類別Pen
//	(1) 兩個屬性：品牌(brand)、價格(price) (封裝設計) 
//	(2) 建構子設計：一個無參數與一個根據屬性而設計
//	(3) 定義Getter/Setter方法
//	(4) 宣告一個抽象方法write()
//	建立兩個子類別Pencil與InkBrush繼承Pen父類別
//	public static void main(String[] args) {
		
//		Pencil myPencil = new Pencil("angel",80);
//		myPencil.write();
//		System.out.println(myPencil.getPrice());
		
//		InkBrush myInkBrush = new InkBrush("dodge",90);
//		myInkBrush.write();
//		System.out.println(myInkBrush.getPrice());
		
//		Pen iPencil = new Pencil("giant",70);
//		iPencil.write();
//		System.out.println(iPencil.getPrice());
//		
//	}
	
	
//	附件有四個Java檔案，我們在Hero類別裡設計了defend()與move()方法，但觀察程式碼之後，你會
//	發現我們在繼承父類別實作抽象方法時，對於defend與move方法的實作方法卻都是一模一樣的內
//	容，請同學想想看，是否有較佳的設計能夠解決重複的實作內容
	
	
//	答：
//	先產生介面決定該做什麼，再將重複實作內容(defend與move方法)以類別的方式實作某個介面，並在類別裡再透過override的方式
//	覆蓋介面裡的方法(attack與move方法)，和其他類別產生差異(attack方法)，在main方法裡以介面宣告實作方法(多形)，透過介面方法設定特定
//	方法以共用相同的內容(move方法)
//	相關程式碼：RoleGameTest.java, Hero.java, SwordMan.java, swingSword.java, ArrowMan.java, shootingArrow.java, run.java

	
}
