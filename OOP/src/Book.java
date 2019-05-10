
public class Book {
	String title;
	String author;
	
	public Book(String t){ //생성자(클래스이름와 같음!)
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a){ //생성자
		title = t;
		author = a;
	}
	
	public  static void main(String [] args){
		Book javaBook = new Book("Java","이창현"); //생성자 Book(String t, String a) 호출
		Book bible = new Book("Bible"); //생성자 Book(String t) 호출
		
		System.out.println(javaBook);
		System.out.println("Title : "+javaBook.title+"," + " Author : " + javaBook.author);
		System.out.println("Titel : "+bible.title+", Author : "+bible.author);
	}
}
