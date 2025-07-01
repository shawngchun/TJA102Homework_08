package HomeWork;

import java.util.Scanner;

public class hw4 {
//	有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	public static void main(String[] args) {
//		int[] x = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
//		hw4_1 num = new hw4_1();
//		num.problem1(x);
//	}
	
//	請建立一個字串，經過程式執行後，輸入結果是反過來的
//	例如String s = “Hello World”，執行結果即為dlroW olleH
//	public static void main(String[] args) {
//		String input;
//		Scanner sc = new Scanner(System.in);
//		input = sc.nextLine();
//		hw4_2 s = new hw4_2();
//		s.problem2(input);
//	}
	
//	有個字串陣列如下(八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	public static void main(String[] args) {
//	    String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//	    String letter = "aeiou";
//	    hw4_3 vowel = new hw4_3();
//	    vowel.problem3(planet,letter);
//	}
	
//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5個...
//	public static void main(String[] args) {
//	    int[][] x = {
//	    	{25,2500},{32,800},{8,500},{19,1000},{27,1200}
//	    };
//	    hw4_4 useful =new hw4_4();
//	    useful.problem4(x);
//	}

//	請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	public static void main(String[] args) {
//	    int[] date = new int[3];
//	    for(int i = 0; i < 3; i++) {
//	    	Scanner sc = new Scanner(System.in);
//	    	date[i] = sc.nextInt();
//	    }
//	    hw4_5 l = new hw4_5();
//	    l.problem5(date);
//	}
	
//	算出每位同學考最高分的次數
	public static void main(String[] args) {
	    int[][] grades = {
	    		{10,35,40,100,90,85,75,70},
	    		{37,75,77,89,64,75,70,95},
	    		{100,70,79,90,75,70,79,90},
	    		{77,95,70,89,60,75,85,89},
	    		{98,70,89,90,75,90,89,90},
	    		{90,80,100,75,50,20,99,75}
	    };
	    
	    int[] student = new int[8];
	    
	    hw4_6 g = new hw4_6();
	    for(int i = 0; i < grades.length; i++) {
	    	g.problem6(grades[i],student); //student門牌號碼沒有變
	    }
	    for(int i = 0; i < student.length; i++) {
	    	System.out.println(i+1 + "號" + student[i] + "次");
	    }
	}
}
