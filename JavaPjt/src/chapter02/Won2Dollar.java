package chapter02;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ��� >> ");
		int x = s.nextInt();
		float dollar = (float)x / 1100;
		System.out.println("��ȭ�� "+dollar+"�޷� �Դϴ�.");
	}
}