package HomeWork;

public class hw5_5 {
	
	public void problem5() {
		
		int[] ranChar = new int[8];
		char[] charArray = new char[8];
		int count = 0;
		while(count < ranChar.length) {
			ranChar[count] = (int)(Math.random()*75);
			if(ranChar[count] < 10) {
				ranChar[count] = ranChar[count] + 48;
				charArray[count] = (char)ranChar[count];
				count = count+1;
			}else if(16 < ranChar[count] && ranChar[count] < 43) {
				ranChar[count] = ranChar[count] + 48;
				charArray[count] = (char)ranChar[count];
				count = count+1;
			}else if(48 < ranChar[count] && ranChar[count] < 75) {
				ranChar[count] = ranChar[count] + 48;
				charArray[count] = (char)ranChar[count];
				count = count+1;
			}
		}
		
		for(int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		
	}

}
