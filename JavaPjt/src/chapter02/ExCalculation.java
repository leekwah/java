package chapter02;

import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2���� �Ǽ� �Է�>> ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		System.out.println("�� ���� ������"+(x+y));
		System.out.println("�� ���� ������"+(x-y));
		System.out.println("�� ���� ������"+(x*y));
		System.out.println("�� ���� ��������"+(x/y));
		scanner.close();
	}
}
