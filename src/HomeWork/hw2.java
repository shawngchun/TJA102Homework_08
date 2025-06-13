package HomeWork;

public class hw2 {
//	請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
//	static public void main(String[] args) {
//		int i = 0, sum = 0;
//		while(i <= 1000) {
//			sum = sum + i;
//			i = i + 2;
//		}
//		System.out.println(sum);
//	}

//	請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//	static public void main(String[] args) {
//		int product = 1;
//		for(i = 1; i <= 10; i++) {
//			product = product * i;
//		}
//		System.out.println(product);
//	}
	
//	請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
//	static public void main(String[] args) {
//		int i = 1, product = 1;
//		while(i <= 10) {
//			product = product * i;
//			i++;
//		}
//		System.out.println(product);
//	}
	
//	請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
//	static public void main(String[] args) {
//		int num = 1;
//		while(num <= 10) {
//			System.out.print(num * num + " ");
//			num++;
//		}
//	}
	
//	阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//	static public void main(String[] args) {
//		int num = 1, count = 0;
//		while(num <= 49) {
//			if(num / 10 != 4 && num % 10 != 4) {
//				System.out.println(num);
//				count++;
//			}
//			num++;
//		}
//		System.out.println("總共有" + count + "個");
//	}
	
//	請設計一隻Java程式,輸出結果為以下:
//	static public void main(String[] args) {
//		for(int j = 10; 1 <= j; j--) {
//			for(int i = 1; i <= j; i++){
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//	}
	
//	請設計一隻Java程式,輸出結果為以下:
	static public void main(String[] args) {
		 for (int i = 0; i < 6; i++) {
	            char letter = (char) ('A' + i);
	            for (int j = 0; j <= i; j++) {
	                System.out.print(letter);
	            }
	            System.out.println();
	        }
	}
}
