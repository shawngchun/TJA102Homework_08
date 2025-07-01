package HomeWork;

public class InkBrush extends Pen{
	
	public InkBrush(String brand, int price) {
		super(brand,(int)(price*0.9));
	}
	public void write() {
		System.out.println("沾墨汁再寫");
	}

}
