
public class Hello {
	//메소드
	public static int sum(int n, int m){
		return n+m;
	}
	
	
	//main() 메소드에서 실행 시작 , args는 다른문자로 대체 가능!
	public static void main(String[] args){
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10); // sum()메소드 호출
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
	
}
