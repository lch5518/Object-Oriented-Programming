import java.util.Scanner;

public class game369 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1~99 사이의 정수를 입력하세요 >>");

		int score = scanner.nextInt();
		int fir = score / 10;
		int sec = score % 10;

		
		switch(fir){
			case 3: 
			case 6: 
			case 9:
				if(sec == 3 || sec == 6 || sec == 9)
					System.out.println("박수 짝짝");
				else System.out.println("박수 짝");
				break;
				
			default :
				if(sec == 3 || sec == 6 || sec == 9)
					System.out.println("박수 짝");
				else System.out.println("박수 없음");
				break;
		}

		scanner.close();
		
	}

}
