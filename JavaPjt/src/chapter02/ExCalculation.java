package chapter02;

import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2개의 실수 입력>> ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		System.out.println("두 수의 덧셈은"+(x+y));
		System.out.println("두 수의 뺄셈은"+(x-y));
		System.out.println("두 수의 곱셈은"+(x*y));
		System.out.println("두 수의 나눗셈은"+(x/y));
		scanner.close();
	}
}