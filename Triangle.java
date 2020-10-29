public class Triangle{

	private Point v1;
	private Point v2;
	private Point v3;

	public Triangle(Point a, Point b, Point c) {
		v1 = a;
		v2 = b;
		v3 = c;
	}

	public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
		v1 = new Point(x1, y1);
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
	}

	public double getPerimeter() {
		return (this.v1.distanceTo(v2) + this.v2.distanceTo(v3) + this.v3.distanceTo(v1));
	}

	public double getArea() {
		double x = this.getPerimeter();
		return (Math.pow(x * (x - this.v1.distanceTo(v2)) * (x - this.v2.distanceTo(v3)) * (x - this.v3.distanceTo(v1)),1/2));
	}

}
