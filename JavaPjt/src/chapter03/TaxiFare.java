package chapter03;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		int fare; int income = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("����� �Է��ϼ���. >>> ");
			fare = scan.nextInt();
			income += fare;
		}
		System.out.println("�� ������ "+income+"�� �Դϴ�.");
		scan.close();
	}
}
