
public class foreachEx {
	public static void main(String[] arg){
		int[] n = {1,2,3,4,5};
		int sum = 0;
		for(int k : n){
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("���� " + sum);
		
		String f[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
		for(String s : f){
			System.out.print(s + " ");
		}
	}
}