package chapter02;

import java.util.Scanner;

public class ExExchange {

	public static void main(String[] args) {
		final double DOL = 1200.0;
		final double EUR = 1500.0;
		Scanner a = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ��� >> ");
		int won = a.nextInt();
		double dollar = won / DOL;
		double euro = won / EUR;
		System.out.println(won+"���� "+dollar+"�޷� �Դϴ�.");
		System.out.println(won+"���� "+euro+"���� �Դϴ�.");
		a.close();
	}
}