package HomeWork;

public class hw4_1 {
	public void problem1(int[] numArray) {
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < numArray.length; i++) {
			sum += numArray[i];
		}
		avg = sum/numArray.length;
		System.out.println(avg);
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] > avg)
				System.out.println(numArray[i]);
		}
	}
}
