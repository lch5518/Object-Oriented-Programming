import java.util.Scanner;

public class Money_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �׼��� �Է��ϼ���>>");
		int money = scanner.nextInt();
		
		int fivethousand = money/50000;
		System.out.print("��������"+fivethousand+"��, ");
		
		int tenthousand = money%50000/10000;
		System.out.print("������"+tenthousand+"��, ");
		
		int thousand = (money%10000)/1000;
		System.out.print("õ����"+thousand+"��, ");
		
		int fiveH = (money%1000)/500;
		System.out.print("500��"+fiveH+"��, ");
		
		int oneH = (money%500)/100;
		System.out.print("100��"+oneH+"��, ");
		
		int ten = (money%100)/10;
		System.out.print("10��"+ten+"��, ");
		
		int one = money%10;
		System.out.print("1��"+one+"��");
		
		scanner.close();

	}
}
