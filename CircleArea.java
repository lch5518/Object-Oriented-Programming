
//보통 클래스 이름은 대문자로 시작, 변수는 소문자로 만든다 
public class CircleArea {
	
	// main(String[] args) <- 시험예상!★
	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 10.2;
		double circleArea = radius * radius * PI;
		
		//원의 면적을 화면에 출력
		System.out.print("반지름 = " + radius + ", ");
		System.out.println("원의 면적 = " + circleArea);
		
		
		int n = 100;
		byte b = (byte)n;
		System.out.println(b);
		
	}

}
