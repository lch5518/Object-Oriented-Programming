import java.util.Scanner;

public class ForSample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("최소값을 입력하세요:");
		int min = scanner.nextInt();
		System.out.println("최 대값을 입력하세요:");
		int max = scanner.nextInt();
		
		int i, mul = 1;
		
		for(i = min; i<=max; i=i+3){
			mul *= i;
			System.out.print(i);
				
			if(i<=15)
				System.out.print("*");
			else{
				System.out.print("=");
				System.out.print(mul);
				
			}
			
		}

	}

}
