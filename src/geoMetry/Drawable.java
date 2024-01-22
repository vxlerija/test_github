package geoMetry;

public abstract class Drawable {

	double x;
	double y;
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "Drawable [x=" + x + ", y=" + y + "]";
	}
	
	
	public abstract double circumference();
	public abstract double area();
}
