package chapter02;

public class LogicalOperator {
	public static void main(String[] args) {
		System.out.println('a' > 'b');//False
		System.out.println(3 >= 2);//True
		System.out.println(-1 < 0);//True
		System.out.println(3.45 <= 2);//False
		System.out.println(3 == 2);//False
		System.out.println(3 != 2);//True
		System.out.println(!(3 != 2)); //True의 not이기에 False
		
		System.out.println();
		System.out.println((3 > 2) && (3 > 4)); //False
		System.out.println((3 != 2) || (-1 > 0)); //True
		System.out.println((3 != 2) ^ (-1 > 0)); //True = A와 B가 다르면 True기에
		System.out.println((3 >= 2) ^ (0 < 1)); //False
	}
}
