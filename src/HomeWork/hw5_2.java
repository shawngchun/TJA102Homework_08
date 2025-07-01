package HomeWork;

public class hw5_2 {
	
	public void problem2() {
		
		int[] ran = new int[11];
		System.out.println("本次亂數結果：");
		for(int i = 0; (i + 1) < ran.length; i++) {
			ran[i] = (int)(Math.random()*101);
			System.out.print(ran[i] + " ");
			ran[(ran.length-1)] = ran[(ran.length-1)] + ran[i];
		}
		System.out.println("");
		System.out.println(ran[(ran.length-1)]/11);
		
	}

}
