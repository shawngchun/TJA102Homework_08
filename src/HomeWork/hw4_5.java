package HomeWork;

public class hw4_5 {
	public boolean leap(int date) {
		if(date%4!=0) {
			return false;
		}else if(date%100!=0) {
			return true;
		}else if(date%400!=0) {
			return false;
		}else {
			return true;
		}
	}
	
	public void problem5(int[] date) {
		int[] leapMonth = {31,29,31,30,31,30,31,31,30,31,30};
		int[] commonMonth = {31,28,31,30,31,30,31,31,30,31,30};
		int days = 0;
		if(leap(date[0])) {
			for(int i = 0; (i+1) < date[1]; i++) {
				days += leapMonth[i];
			}
			days = days + date[2];
			System.out.println("輸入的日期為該年第" + days + "天");
		}else {
			for(int i = 0; (i+1) < date[1]; i++) {
				days += commonMonth[i];
			}
			days = days + date[2];
			System.out.println("輸入的日期為該年第" + days + "天");
		}
	}
}
