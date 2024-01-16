package geoMetry;

public class Rectangle extends Drawable{

	private double length;
	private double width;
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	@Override
	public double circumference() {
		return this.length*2 + this.width*2;
	}
	@Override
	public double area() {
		return this.length*this.width;
	}
	
	
}
