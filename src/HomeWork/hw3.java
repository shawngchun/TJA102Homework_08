package HomeWork;

import java.util.Scanner;

public class hw3 {
//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
//	public static void main(String[] args) {
//		int[] side = new int[3];
//		hw3_triangle triangle = new hw3_triangle();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入：");
//		for(int i = 0; i < 3; i++) {
//			side[i] = sc.nextInt();
//		}
//		triangle.h3_triangle(side);
//	}
	
//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
//	public static void main(String[] args) {
//		int input = -1;
//		int guess = 0;
//		guess = (int)(Math.random()*10);
//		hw3_guess num = new hw3_guess();
//		System.out.println("開始猜數字吧！");
//		do {
//			Scanner sc = new Scanner(System.in);
//			input = sc.nextInt();
//			num.random(input,guess);
//		}while(input != guess);
//	}
	
//	阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//	厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//	的號碼與總數
	public static void main(String[] args) {
		int input = 0;
		hw3_lottery num = new hw3_lottery();
		System.out.println("阿文...請輸入你討厭哪個數字？");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		num.h3_lottery(input);
	}
}