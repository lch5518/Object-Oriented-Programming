import java.util.Scanner;

public class Money_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("돈의 액수를 입력하세요>>");
		int money = scanner.nextInt();
		
		int fivethousand = money/50000;
		System.out.print("오만원권"+fivethousand+"개, ");
		
		int tenthousand = money%50000/10000;
		System.out.print("만원권"+tenthousand+"개, ");
		
		int thousand = (money%10000)/1000;
		System.out.print("천원권"+thousand+"개, ");
		
		int fiveH = (money%1000)/500;
		System.out.print("500원"+fiveH+"개, ");
		
		int oneH = (money%500)/100;
		System.out.print("100원"+oneH+"개, ");
		
		int ten = (money%100)/10;
		System.out.print("10원"+ten+"개, ");
		
		int one = money%10;
		System.out.print("1원"+one+"개");
		
		scanner.close();

	}
}
