
public class IntegerConstant {

	public static void main(String[] args) {
		int i=255, o = 0377, h = 0xff;
		long l=0xffL;
		System.out.println("i = " + i + ", o = " + o + ", h = " + h);
		if(h == l) 
			System.out.println("Yes");
		else 
			System.out.println("No");
		
	}

}
