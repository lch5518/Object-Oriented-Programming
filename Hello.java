
public class Hello {
	//�޼ҵ�
	public static int sum(int n, int m){
		return n+m;
	}
	
	
	//main() �޼ҵ忡�� ���� ���� , args�� �ٸ����ڷ� ��ü ����!
	public static void main(String[] args){
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10); // sum()�޼ҵ� ȣ��
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
	
}
