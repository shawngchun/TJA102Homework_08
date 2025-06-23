package HomeWork;

import java.util.Scanner;

public class hw4_4 {
	public void problem4(int[][] x) {
		int money = 0, count = 0;
		System.out.println("要多少？");
	    Scanner sc = new Scanner(System.in);
	    money = sc.nextInt();
	    System.out.print("有錢可借的員工編號：");
	    for(int i = 0; i < x.length; i++) {
	    	if(x[i][1] >= money) {
	    		System.out.print(x[i][0] + " ");
	    		count++;
	    	}
	    }
	    System.out.print("共" + count + "人！");
	}
}
