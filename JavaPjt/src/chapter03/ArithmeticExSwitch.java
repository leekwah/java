package chapter03;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산 >> ");
		int x = scan.nextInt();
		String op = scan.next();
		int y = scan.nextInt();
		int result = 0;
		
		switch (op) {
			case "+":
				result = x + y;
				break;
			case "-":
				result = x - y;
				break;
			case "*":
				result = x * y;
				break;
			case "/":
				if (y==0) {
					System.out.println("0으로 나눌 수 없습니다.");
					scan.close();
					return;
				} else
				result = x / y;
				break;
		default:
			System.out.print("사칙연산이 아닙니다.");
			scan.close();
			return;
		}
		System.out.print(x+op+y+"의 계산 결과는 "+result+"입니다.");
		scan.close();
	}
}