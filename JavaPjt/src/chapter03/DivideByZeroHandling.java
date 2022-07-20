package chapter03;

import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dividend;
		int divisor;

		// 반복문 무한반복
		while (true) {
			System.out.print("분자를 입력하시오 :");
			dividend = scan.nextInt();
			System.out.print("분자를 입력하시오 :");
			divisor = scan.nextInt();
			
			try {
				System.out.println(dividend+"를 "+divisor+"로 나누면 "+(dividend/divisor)+"입니다.");
				break; // break를 넣지 않으면, 못빠져 나오기 때문에 꼭 잊지 말아야한다.
				// 0으로 나누면 "java.lang.ArithmeticException" ERROR가 나오게 된다.
				// e로 받는 다는 것이다.
				// 이걸 예외처리 하겠다.
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		}
		scan.close();
	}
}
