package chapter02;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		System.out.print("2���� ���� �Է� >>");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println("�� ���� ���� "+(x+y));
		System.out.println("�� ���� ���� "+(x*y));
		scanner.close();
	}
}