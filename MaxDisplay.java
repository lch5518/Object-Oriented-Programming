
import java.util.Scanner;

public class MaxDisplay {

	public static void main(String[] args) {
		Scanner iValue = new Scanner(System.in);
		System.out.println("������ 3�� �Է��� �ּ���!");
		int i1 = iValue.nextInt();
		int i2 = iValue.nextInt();
		int i3 = iValue.nextInt();
		
		int max = (i1>i2)?i1:i2;
		max = (max > i3)?max:i3;
		
		System.out.println("�Է��� ���� i1 = " + i1 + ", i2 = " + i2 + ", i3 = " + i3);
		System.out.println("�ִ밪 : " + max);
		//System.out.println("�ִ밪  : " + (((i1>i2)&(i1>i3))?i1:(i2>i3)?i2:i3));
		
		iValue.close();

	}

}

