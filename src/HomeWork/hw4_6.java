package HomeWork;

import java.util.Arrays;

public class hw4_6 {
	public void problem6(int[] grade, int[] students) {
		
		int[] test = Arrays.copyOf(grade, grade.length);
		Arrays.sort(test);
		int highest = test[(test.length-1)];
		for(int i = 0; i < grade.length; i++) {
			if(grade[i] == highest) {
				students[i] = students[i]+1;
			}
		}
//		return students;
	}



}
