package HomeWork;

public class Pencil extends Pen{
	
	public Pencil(String brand, int price) {
		super(brand,(int)(price*0.8));
	}
	public void write() {
		System.out.println("削鉛筆再寫");
	}

}
