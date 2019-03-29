
import java.util.Scanner;

public class MaxDisplay {

	public static void main(String[] args) {
		Scanner iValue = new Scanner(System.in);
		System.out.println("정수를 3개 입력해 주세요!");
		int i1 = iValue.nextInt();
		int i2 = iValue.nextInt();
		int i3 = iValue.nextInt();
		
		int max = (i1>i2)?i1:i2;
		max = (max > i3)?max:i3;
		
		System.out.println("입력한 정수 i1 = " + i1 + ", i2 = " + i2 + ", i3 = " + i3);
		System.out.println("최대값 : " + max);
		//System.out.println("최대값  : " + (((i1>i2)&(i1>i3))?i1:(i2>i3)?i2:i3));
		
		iValue.close();

	}

}

