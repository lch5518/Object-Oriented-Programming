import java.util.Scanner;
class Book1{
	String title, author;
	public Book1(String title, String author){
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		Book1 [] book = new Book1[2]; //Book배열선언
		
		for(int i=0;i<book.length;i++){
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book1(title, author); //배열 원소 객체 생성
		}
		
		for(int i = 0; i<book.length;i++){
			System.out.print("("+book[i].title+", "+book[i].author+")\n");
		}
		
		scanner.close();
	}
}
