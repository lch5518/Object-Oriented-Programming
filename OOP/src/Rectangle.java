
public class Rectangle {
	int width;
	int height;
	int getArea(){
		return width*height;
	}
	
	public static void main(String[] args){
		Rectangle rect = new Rectangle();
		rect.width = 4;
		rect.height = 5;
		System.out.println("사격형의 면적은 " + rect.getArea());
	}
}


