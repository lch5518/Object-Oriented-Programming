import java.util.Scanner;

public class game369 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1~99 ������ ������ �Է��ϼ��� >>");

		int score = scanner.nextInt();
		int fir = score / 10;
		int sec = score % 10;

		
		switch(fir){
			case 3: 
			case 6: 
			case 9:
				if(sec == 3 || sec == 6 || sec == 9)
					System.out.println("�ڼ� ¦¦");
				else System.out.println("�ڼ� ¦");
				break;
				
			default :
				if(sec == 3 || sec == 6 || sec == 9)
					System.out.println("�ڼ� ¦");
				else System.out.println("�ڼ� ����");
				break;
		}

		scanner.close();
		
	}

}
