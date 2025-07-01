package HomeWork;

public abstract class Pen {
	
	private String brand;
	private int price;

	public Pen() {}
	
	public Pen(String brand, int price) {
		if(price > 0)
			this.price = price;
		else
			System.out.println("Wrong price!!!");
		this.brand = brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		if(price > 0)
			this.price = price;
		else
			System.out.println("Wrong price!!!");
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public abstract void write();

}
