package HomeWork;

import java.util.Arrays;

public class hw5_3 {
	
	public int maxElment(int[][] intArray) {
		
		int[] max = new int[intArray.length];
		for(int i = 0; i < intArray.length; i++) {
			Arrays.sort(intArray[i]);
			max[i] = intArray[i][intArray[i].length-1];
		}
		Arrays.sort(max);
		return max[max.length-1];
		
	}
	
	public double maxElment(double[][] doubleArray) {
		
		double[] max = new double[doubleArray.length];
		for(int i = 0; i < doubleArray.length; i++) {
			Arrays.sort(doubleArray[i]);
			max[i] = doubleArray[i][doubleArray[i].length-1];
		}
		Arrays.sort(max);
		return max[max.length-1];
		
	}

}
