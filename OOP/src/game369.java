import java.util.Scanner;

public class game369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~99 ������ ������ �Է��ϼ��� >>");
		int score = scanner.nextInt();
		int fir = score/10; //int������ �����κи� ����
		int sec = score%10; //������
		
		//�Է°��� ������ ���� �ƴѰ�� �ٽ�.
		if(score<1 || score>99) {
			System.out.println("������ ������ϴ�. 1~99 ������ ������ �Է����ּ���>>");
			while(score<1 || score>99) {
				score = scanner.nextInt();
			}
			fir = score/10;
			sec = score%10;
		}
		
		switch(fir){ 
			//ù��° ���ڰ� 3,6,9�϶� ���� �ι�°���ڵ� 3 or 6 or 9�̸� �ڼ�¦¦ �ƴϸ� �ڼ�¦
			case 3: 
			case 6: 
			case 9:
				if(sec == 3 || sec == 6 || sec == 9)
					System.out.println("�ڼ�¦¦");
				else 
					System.out.println("�ڼ�¦");
				break;
			//ù��° ���ڿ� 3,6,9�� �ƴ� �� ���� �ι�°���ڰ�  3 or 6 or 9�̸� �ڼ�¦
			default :
				if(sec == 3 || sec == 6 || sec == 9)
					System.out.println("�ڼ�¦");
				else  //�Ѵ� �ƴϸ� �ڼ�����
					System.out.println("�ڼ�����");
				break;
		}
		scanner.close();
	}
}
