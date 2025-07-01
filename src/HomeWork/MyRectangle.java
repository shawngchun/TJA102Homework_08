package HomeWork;

public class MyRectangle {
	private double width;
	private double depth;
	
	public MyRectangle() {}
	
	public MyRectangle(double width, double depth) {
		if(width > 0)
			this.width = width;
		else
			System.out.println("請確認width");
		if(depth > 0)
			this.depth = depth;
		else
			System.out.println("請確認depth");
	}

	public double getArea() {
		return width*depth;
	}
	public void setWidth(double widthXXX) {
		if(widthXXX > 0)
			width = widthXXX;
		else
			System.out.println("請確認width");
	}
	
	public void setDepth(double depthXXX) {
		if(depthXXX > 0)
			depth = depthXXX;
		else
			System.out.println("請確認depth");
	}
}
