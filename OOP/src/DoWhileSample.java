
public class DoWhileSample {
	public static void main(String[] arg){
		char a = 'A';
		int count = 0;
		do {
			System.out.print((char)(a+32));
			a = (char)(a + 1);
			count++;
		}while(a <= 'z');
		System.out.println("\n°³¼ö:"+ count);
	}
}
