package chapter03;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산 >> ");
		int x = scan.nextInt();
		String op = scan.next();
		int y = scan.nextInt();
		int result = 0;
		
		if (op.equals("+")) {
			result = x + y;
		} else if (op.equals("-")) {
			result = x - y;
		} else if (op.equals("*")) {
			result = x * y;
		} else if (op.equals("/")) {
			if (y==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				scan.close();
				return;
			} else {
				result = x / y;
			}
		} else {
			System.out.println("사칙 연산이 아닙니다.");
		}
		System.out.println(x+op+y+"의 연산결과는 "+result);
		scan.close();
	}
}
