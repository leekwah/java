package chapter02;

import java.util.Scanner;

public class ExCalculation2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2���� �Ǽ� �Է�>> ");
		
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		
		System.out.println("�� ���� ������"+(x+y));
		System.out.println("�� ���� ������"+(x-y));
		System.out.println("�� ���� ������"+(x*y));
		System.out.println("�� ���� ��������"+(x/y));
		
		scanner.close();
	}

}
