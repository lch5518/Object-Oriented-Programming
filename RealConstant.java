
public class RealConstant {

	public static void main(String[] args) {
		float f1 = 1.414F, f2 = 0.1414e01f;
		double d = 0.414E1;
		
		System.out.println("f1 = " + f1 + ", f2 = " + f2 + ", d = " + d);
		
		if(f1 == f2)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		if(f2 == d)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
