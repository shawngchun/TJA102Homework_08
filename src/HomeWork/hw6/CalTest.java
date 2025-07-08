package HomeWork.hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		int x, y;
		
		while (true) {
			while (true) {
				System.out.println("請輸入x的值：");
			try {
				Scanner sx = new Scanner(System.in);
				x = sx.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
			}
			}
			
			while (true) {
				System.out.println("請輸入y的值：");
			try {
				Scanner sy = new Scanner(System.in);
				y = sy.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
			}
			}
			
			Calculator xPowery = new Calculator();
			try {
				xPowery.powerXY(x, y);
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
			} 
		}
		
		
	}

}
