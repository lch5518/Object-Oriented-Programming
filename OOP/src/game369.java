import java.util.Scanner;

public class game369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하세요 >>");
		int score = scanner.nextInt();
		int fir = score/10; //int형으로 정수부분만 추출
		int sec = score%10; //나머지
		
		//입력값이 범위의 값이 아닌경우 다시.
		if(score<1 || score>99) {
			System.out.println("범위를 벗어났습니다. 1~99 사이의 정수만 입력해주세요>>");
			while(score<1 || score>99) {
				score = scanner.nextInt();
			}
			fir = score/10;
			sec = score%10;
		}
		
		switch(fir){ 
			//첫번째 숫자가 3,6,9일때 만약 두번째숫자도 3 or 6 or 9이면 박수짝짝 아니면 박수짝
			case 3: 
			case 6: 
			case 9:
				if(sec == 3 || sec == 6 || sec == 9)
					System.out.println("박수짝짝");
				else 
					System.out.println("박수짝");
				break;
			//첫번째 숫자에 3,6,9가 아닐 때 만약 두번째숫자가  3 or 6 or 9이면 박수짝
			default :
				if(sec == 3 || sec == 6 || sec == 9)
					System.out.println("박수짝");
				else  //둘다 아니면 박수없음
					System.out.println("박수없음");
				break;
		}
		scanner.close();
	}
}
