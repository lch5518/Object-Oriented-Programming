
public class Book {
	String title;
	String author;
	
	public Book(String t){ //������(Ŭ�����̸��� ����!)
		title = t;
		author = "���ڹ̻�";
	}
	
	public Book(String t, String a){ //������
		title = t;
		author = a;
	}
	
	public  static void main(String [] args){
		Book javaBook = new Book("Java","��â��"); //������ Book(String t, String a) ȣ��
		Book bible = new Book("Bible"); //������ Book(String t) ȣ��
		
		System.out.println(javaBook);
		System.out.println("Title : "+javaBook.title+"," + " Author : " + javaBook.author);
		System.out.println("Titel : "+bible.title+", Author : "+bible.author);
	}
}
