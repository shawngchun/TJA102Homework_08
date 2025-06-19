package HomeWork;

import java.util.Arrays;

public class hw3_triangle {

	 public void h3_triangle(int[] sideArray) {
			Arrays.sort(sideArray);
			if((sideArray[0] + sideArray[1]) > sideArray[2]) {
				if(sideArray[0] == sideArray[1] && sideArray[2] == sideArray[1]) {
					System.out.println("正三角形");
				}else if(sideArray[0] == sideArray[1] || sideArray[2] == sideArray[1]){
					System.out.println("等腰三角形");
				}else if((Math.pow(sideArray[0], 2) + Math.pow(sideArray[1], 2)) == Math.pow(sideArray[2], 2)){
					System.out.println("直角三角形");
				}else {
					System.out.println("其他三角形");
				}
			}else {
				System.out.println("這不構成三角形");
			}
		}


}
