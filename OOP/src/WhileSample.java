import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0, n = 0;
		double sum = 0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
		while(true){
			n = scanner.nextInt();
			if(n == 0) break;
				
			sum = sum + n;
			count++;
		}
		System.out.print("���� ������ " + count + "�� �̸� ");
		System.out.println("����� " + sum/count + "�Դϴ�.");
		
		scanner.close();
	}

}
 
