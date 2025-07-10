package HomeWork.hw8;

import java.util.Objects;


public class Train implements Comparable<Train> {
	
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(int number, String type, String start, String dest, double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public String toString() {
		return ("班次：" + number + ", 車種：" + type + ", 出發地：" + start + ", 目的地：" + dest + ", 票價：" +price);
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Train aTrain) {
		//物件本身與 aTrain 相比較，如果 return 正值，就表示比 aTrain 大
		if (this.number > aTrain.number) {
			return 1;
		} else if (this.number == aTrain.number){
			return 0;
		}
		else {
			return -1;
		}
		// 這邊回傳的正負值是用來描述兩個物件的"左右(先後)"關係
	}
	
	public int hashCode() {
		return Objects.hash(number);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number && Objects.equals(type, other.type);
	}

	
}
