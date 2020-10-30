public class Point {

	private double x;
	private double y;

	public Point(double X, double Y) {
		x = X;
		y = Y;
	}

	public Point(Point p) {
		x = p.x;
		y = p.y;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public double distanceTo(Point other) {
		double x1 = other.getX() - x;
		double y1 = other.getY() - y;
		return Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2));
	}

	public boolean equals(Point other) {
		return (this.getX() == other.getX() && this.getY() == other.getY());
	}

}
