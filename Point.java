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
		return Math.pow(Math.pow(other.getX() - this.getX(),2) + Math.pow(other.getY() - this.getY(),2), 1/2);
	}

	public boolean equals(Point other) {
		return (this.getX() == other.getX() && this.getY() == other.getY());
	}

}
