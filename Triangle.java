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
		double x1 = v1.distanceTo(v2);
		double x2 = v2.distanceTo(v3);
		double x3 = v3.distanceTo(v1);
		//System.out.println(x1 + "====");
                //System.out.println(x2 + "=======");
                //System.out.println(x3 + "=");
		//System.out.println(x1 + x3);
		double n = x1 + x2 + x3;
		return n;
	}

	public double getArea() {
		//double x = this.getPerimeter();
		//return (Math.pow(x * (x - this.v1.distanceTo(v2)) * (x - this.v2.distanceTo(v3)) * (x - this.v3.distanceTo(v1)),1/2));
		double semi = this.getPerimeter()/2;
		double a = v1.distanceTo(v2);
		double b = v2.distanceTo(v3);
		double c = v3.distanceTo(v1);
		double area = Math.sqrt(semi * (semi - a) * (semi - b) * (semi - c));
		return area;
	}

	public double rounding(double x) {
		double x1 = x * 10000;
		double x2 = Math.round(x1);
		double x3 = x2/10000;
		return x3;
	}

	public String classify() {
		double side1 = rounding(this.v1.distanceTo(v2));
		double side2 = rounding(this.v2.distanceTo(v3));
		double side3 = rounding(this.v3.distanceTo(v1));
		if (side1 == side2 && side2 == side3) {
			return "equilateral";
		}
		else if (side1 == side2 || side2 == side3 || side3 == side1) {
			return "isosceles";
		}
		else {
			return "scalene";
		}
	}

	public String toString() {
		return ("v1(" + String.valueOf(this.v1.getX()) + ", " + String.valueOf(this.v1.getY()) + ") v2(" + String.valueOf(this.v2.getX()) + ", " + String.valueOf(this.v2.getY()) + ") v3(" + String.valueOf(this.v3.getX()) + ", " + String.valueOf(this.v3.getY()) + ")");
	}

	public void setVertex(int index, Point newP) {
		if (index == 0) {
			v1 = new Point(newP);
		}
		else if (index == 1) {
			v2 = new Point(newP);
		}
		else if (index == 2){
			v3 = new Point(newP);
		}
		else {
			System.out.println("invalid index provided");
		}
	}

}
