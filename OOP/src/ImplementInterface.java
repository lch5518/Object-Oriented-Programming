interface BaseColors{
	int RED = 1, GREEN = 2, BLUE = 4;
	void setColor(int color);
	int getColor();
}
abstract class SetColor implements BaseColors{
	protected int color;
	public void setColor(int color) {
		this.color = color;
		System.out.println("In the setColor method...");
	}
}

class Color extends SetColor{
	public int getColor() {
		System.out.println("In the getColor method...");
		return color;
	}
}
public class ImplementInterface {
	public static void main(String[] args) {
		Color c = new Color();
		int i;
		c.setColor(10);
		i = c.getColor();
		System.out.println(i);
		System.out.println("In the main method...");

	}

}
