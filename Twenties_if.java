import java.util.Scanner;
public class Twenties_if {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���̸� �Է��Ͻÿ�:");
		int age = scanner.nextInt();
		if((age >= 20) && (age<30)){
			System.out.println("20���Դϴ�.");
		}
		else
			System.out.println("20�밡 �ƴմϴ�.");
		
		scanner.close();

	}

}
