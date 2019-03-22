import java.util.Scanner;


public class ScannerExample {

	public static void main(String[] args) {
		System.out.println("학번, 이름, 원의 반지름, 시간을 빈칸으로 분리해서 입력하세요.");
		
		final double PI = 3.14;
		Scanner scanner = new Scanner(System.in);
		
		int stuNo = scanner.nextInt();
		System.out.println("당신의 학번운 " + stuNo + "입니다.");
		
		String stuName = scanner.next();
		System.out.println("당신의 이름은 " + stuName + "입니다.");
		
		double radius = scanner.nextDouble();
		System.out.println("원의 반지름은 " + radius + "입니다.");
		System.out.println("원의 면적 " + radius*radius*PI + "입니다.");
		
		int time = scanner.nextInt(); // 정수 입력
		int second = time % 60; // 60으로 나눈 나머지는 초
		int minute = (time / 60) % 60; // 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time / 60) / 60; // 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간

		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");
		
		scanner.close();
	}

}
