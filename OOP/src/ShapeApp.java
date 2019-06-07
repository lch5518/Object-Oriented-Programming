package chapter5;

interface Shape{
	final double PI = 3.14;			//상수
	void draw();					//추상 메소드
	double getArea();				//추상 메소스
	default public void redraw(){	//코드가 작성된 디폴트 메소드
		System.out.println("--- 다시 그립니다. ---");
		draw();
	}
}

class Circle implements Shape{
	public int a;
	public Circle(int i) {a = i;}
	public void draw() {System.out.print("반지름 "+a+" ");}
	public double getArea() {return PI*a*a;}
}

public class ShapeApp{
	public static void main(String[] args){
		Shape coin = new Circle(10); //반지름이 10인 코인 객체 생셩
		coin.redraw();	//코인 다시그리기
		System.out.println("코인 면적은 " + coin.getArea());
	}
}
