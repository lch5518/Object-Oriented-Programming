import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요");
		int intArray[] = new int[5];
		
		double sum = 0.0;
		for(int i = 0; i<intArray.length; i++){
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}
		
		System.out.println("평균은 " + sum/intArray.length);
		scanner.close();
	}
}

//1)class이름은 대문자로 작성한다.
//2)변수명, 메소드병, 필드명, 객체명은 소문자로 시작한다.
//3)모든이름은 약어를 사용하지 않는다.
//4)복합단어는 붙어서 쓴다.
//5)복합단어의 경우 뒷 단어의 첫글자는 대문자로 쓴다.