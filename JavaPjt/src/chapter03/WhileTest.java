package chapter03;

public class WhileTest {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;

		while(i < 100) {
			sum += i;
			i = i+2;
		}
		System.out.println(sum);
	}
}