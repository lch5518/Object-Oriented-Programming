abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
//추상 클래스 Calculator를 상속받는 GoodCalc 클래스를 구현하라.

public class GoodCalc extends Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public double average(int[] a) {
		double sum = 0;
		for(int i=0; i<a.length;i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(5, 2));
		System.out.println(c.subtract(5, 2));
		System.out.println(c.average(new int [] {1,2,3,4,5}));

	}

}
