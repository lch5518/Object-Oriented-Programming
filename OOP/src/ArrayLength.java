import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5���� ������ �Է��ϼ���");
		int intArray[] = new int[5];
		
		double sum = 0.0;
		for(int i = 0; i<intArray.length; i++){
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}
		
		System.out.println("����� " + sum/intArray.length);
		scanner.close();
	}
}

//1)class�̸��� �빮�ڷ� �ۼ��Ѵ�.
//2)������, �޼ҵ庴, �ʵ��, ��ü���� �ҹ��ڷ� �����Ѵ�.
//3)����̸��� �� ������� �ʴ´�.
//4)���մܾ�� �پ ����.
//5)���մܾ��� ��� �� �ܾ��� ù���ڴ� �빮�ڷ� ����.