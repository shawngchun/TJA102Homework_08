package HomeWork;

import java.util.Arrays;

public class hw3_lottery {
	public void h3_lottery(int number) {
		int num = 1, count = 0;
		while(num <= 49) {
			if(num / 10 != number && num % 10 != number) {
				System.out.print(num + " ");
				count++;
				if(count % 7 == 0)
					System.out.println("");
			}
			num++;
		}
		System.out.println("總共有" + count + "個數字可選");
	}

}
