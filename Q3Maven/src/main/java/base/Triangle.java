package base;

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	public Triangle() {

	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override
	public double getArea() {
		double m = getPerimeter() / 2;
		double a = Math.sqrt(m * ((m - side1) * (m - side2) * (m - side3)));
		return a;
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return ("Area:" + getArea() + "Perimeter:" + getPerimeter());
	}

}
