package chapter02;

import java.util.Scanner;

// �ӱݰ��
// 8�ð� ������ �ð��� 5000��
// 8�ð� �ʰ� -> 1.5�� ����

public class Pay {
	public static void main(String[] args) {
		final int RATE = 5000;
		int pay;
		int hours; // �ð��� �Է¹޾Ƽ� ó���� ���̴�.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ð��� �Է��Ͻÿ� : ");
		hours = scan.nextInt();
		// �б�ó���� �� ���̴�.
		
		if (hours > 8) {
			// ��������ȯ �ʿ��ϴ�.
			pay = (int)(RATE * 8 + (1.5 * RATE * (hours - 8)));
		} else {
			pay = RATE * hours;
		}
		System.out.println("�ӱ��� "+pay+"�� �Դϴ�.");
		scan.close();
	}
}