
public class DowncastingEx {
	public static void main(String[] args) {
		Person p = new Student("���繮"); //��ĳ����
		Student s;
		
		s = (Student)p; //�ٿ�ĳ����
		
		System.out.println(s.name);
		s.grade = "A";
		System.out.println(s.grade);
	}
}
