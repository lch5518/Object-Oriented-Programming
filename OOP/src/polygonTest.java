abstract class Polygon{
	public abstract double calcLength();
}
class Rectangle extends Polygon{
	int height;
	int width;
	Rectangle(int h, int w){
		height = h;
		width = w;
	}
	public double calcLength() {
		double length = 2 * (height + width);
		return length;
	}
}

class Circle0 extends Polygon{
	private int radius;
	public static final double pi = 3.14;
	Circle0(int r){
		radius = r; 
	}
	public double calcLength() {
		double length = 2 * radius * pi;
		return length;
	}
}
public class polygonTest {
	public static void main(String[] args) {
		Polygon p = new Rectangle(5,8);
		System.out.println("Area of radius r is " + p.calcLength());
		p = new Circle0(4);
		System.out.println("Area of circle c is " + p.calcLength());

	}

}
