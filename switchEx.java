import java.util.Scanner;

public class switchEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수(0~100)을 입력하시오.:");
		int score = scanner.nextInt();
		int score1 = (score/10);
		switch(score1){
			case 9:
				System.out.println("학점은 A입니다.");
				break;
			case 8:
				System.out.println("학점은 B입니다.");
				break;
			case 7:
				System.out.println("학점은 C입니다.");
				break;
			case 6:
				System.out.println("학점은 D입니다.");
				break;
			default:
				System.out.println("학점은 F입니다.");
		}
		scanner.close();

	}

}
