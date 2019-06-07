package chapter5;

interface Shape{
	final double PI = 3.14;			//���
	void draw();					//�߻� �޼ҵ�
	double getArea();				//�߻� �޼ҽ�
	default public void redraw(){	//�ڵ尡 �ۼ��� ����Ʈ �޼ҵ�
		System.out.println("--- �ٽ� �׸��ϴ�. ---");
		draw();
	}
}

class Circle implements Shape{
	public int a;
	public Circle(int i) {a = i;}
	public void draw() {System.out.print("������ "+a+" ");}
	public double getArea() {return PI*a*a;}
}

public class ShapeApp{
	public static void main(String[] args){
		Shape coin = new Circle(10); //�������� 10�� ���� ��ü ����
		coin.redraw();	//���� �ٽñ׸���
		System.out.println("���� ������ " + coin.getArea());
	}
}
