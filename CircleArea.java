
public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 10.2; //실수 뒤에 문자가 없으면 기본으로 더블형
		double circleArea = radius*radius*PI;
		float f = (float) 0.12345;
		
		System.out.println("반지름 " + radius + ", ");
		System.out.println("원의 면적 = " + circleArea);
		System.out.println("f = " + f);
	

	}

}
