package chapter02;

import java.util.Scanner;

public class Won2Dollar2_1 {
	// main�޼ҵ�� {} ��ü ��ȣ �ȿ� �ִ� �͵��̰�, main�޼ҵ� �ȿ��� �޼ҵ尡 ���Ե� �� �ִ�.
	public static void main(String[] args) {
		// RATE�� ����� ���� �� �빮�ڷ� ���� �� ��õ�Ѵ�.
		// ������ ���� ���� ��쿡�� 1100�� ���� �ͺ���, ����� �Է��صδ� ���� ���ϴ�.
		final double RATE = 1100.0;
		Scanner a = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ��� >> ");
		int won = a.nextInt();
		double dollar = won / RATE;
		System.out.println(won+"���� $"+dollar+"�Դϴ�.");
		a.close();
	}
}