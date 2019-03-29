
public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		System.out.println((3 > 2) && (3 > 4)); //AND
		System.out.println((3 != 2) || (-1 > 0)); //OR
		System.out.println((3 != 2) ^ (1 > 0)); //XOR : 둘다  true일때 false
		
	}

}
