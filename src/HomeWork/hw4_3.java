package HomeWork;

public class hw4_3 {
	public void problem3(String[] args, String letter) {
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
            for(int j = 0; j < args[i].length(); j++) {
            	for(int k = 0; k < letter.length(); k++) {
            		if(args[i].charAt(j) == (letter.charAt(k)))
            		sum += 1;
            	}
            }
        }
        System.out.println(sum);
	}
}
