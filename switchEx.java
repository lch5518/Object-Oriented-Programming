import java.util.Scanner;

public class switchEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����(0~100)�� �Է��Ͻÿ�.:");
		int score = scanner.nextInt();
		int score1 = (score/10);
		switch(score1){
			case 9:
				System.out.println("������ A�Դϴ�.");
				break;
			case 8:
				System.out.println("������ B�Դϴ�.");
				break;
			case 7:
				System.out.println("������ C�Դϴ�.");
				break;
			case 6:
				System.out.println("������ D�Դϴ�.");
				break;
			default:
				System.out.println("������ F�Դϴ�.");
		}
		scanner.close();

	}

}
