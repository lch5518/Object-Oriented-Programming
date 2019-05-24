class SuperClass{
	int a, b;
	SuperClass(){
		a = 1;
		b = 1;
	}
	SuperClass(int a, int b){
		this.a = a;
		this.b = b;
	}
}

class SubClass extends SuperClass{
	int c;
	SubClass(){
		c = 1;
	}
	SubClass(int a, int b, int c){
		super(a,b);
		this.c = c;
	}
}
public class SuperCallTest {
	public static void main(String[] args) {
		SubClass obj1 = new SubClass();
		SubClass obj2 = new SubClass(1,2,3);
		System.out.println("abc:"+obj1.a+obj1.b+obj1.c);
		System.out.println("abc:"+obj2.a+obj2.b+obj2.c);
	}
}
