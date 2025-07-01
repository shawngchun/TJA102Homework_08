package HomeWork;

import java.util.Scanner;

public class hw5_1 {
	
	public void problem1(){
		
	int width, length;
	Scanner sc = new Scanner(System.in);
	width = sc.nextInt();
	length = sc.nextInt();
	for(int i = 0; i < length; i++) {
		for(int j = 0; j < width; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	}
	
}
