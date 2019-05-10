
public class Circle2 {
	int radius;
	void set(int r){radius = r;}
	double getArea(){ 
		double result = 3.14*radius*radius; 
		return result;
		}
	
	public Circle2(int r){
		radius = r;
	}
	
	public Circle2(){
		radius = 7;
	}
	
	public static void main(String[] args){
		//생성자가 없을 경우 자동생성하지만 이미 생성자가 있을 경우 매게변수가 필요하다.
		Circle2 pizza = new Circle2(10);  
		pizza.set(5);
		System.out.println(pizza.getArea());
		
		Circle2 donut = new Circle2();
		System.out.println(donut.getArea());
	}
}
