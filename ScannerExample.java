import java.util.Scanner;


public class ScannerExample {

	public static void main(String[] args) {
		System.out.println("�й�, �̸�, ���� ������, �ð��� ��ĭ���� �и��ؼ� �Է��ϼ���.");
		
		final double PI = 3.14;
		Scanner scanner = new Scanner(System.in);
		
		int stuNo = scanner.nextInt();
		System.out.println("����� �й��� " + stuNo + "�Դϴ�.");
		
		String stuName = scanner.next();
		System.out.println("����� �̸��� " + stuName + "�Դϴ�.");
		
		double radius = scanner.nextDouble();
		System.out.println("���� �������� " + radius + "�Դϴ�.");
		System.out.println("���� ���� " + radius*radius*PI + "�Դϴ�.");
		
		int time = scanner.nextInt(); // ���� �Է�
		int second = time % 60; // 60���� ���� �������� ��
		int minute = (time / 60) % 60; // 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) / 60; // 60���� ���� ���� �ٽ� 60���� ���� ���� �ð�

		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.println(second + "���Դϴ�.");
		
		scanner.close();
	}

}
