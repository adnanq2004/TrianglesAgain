public class Point {

	private double x;
	private double y;

	public void Point(double X, double Y) {
		x = X;
		y = Y;
	}

	public void Point(Point p) {
		x = p.x;
		y = p.y;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

}
