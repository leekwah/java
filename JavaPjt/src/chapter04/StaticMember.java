package chapter04;

import java.util.Scanner;

class CurrencyConverter {
	private static double rate; // 1$ �� ���� ��ȭ
	public static double toDollar(double won) {
		return won/rate; // ��ȭ�� �޷��� ��ȭ
	}
	public static double toKWR(double dollar) {
		return dollar *rate; // �޷��� ��ȭ�� ��ȯ
	}
	public static void setRate(double r) {
		rate = r; // ȯ������. ��/$1
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ȯ��(1�޷�) >> ");
		double rate = sc.nextDouble();
		CurrencyConverter.setRate(rate); // �̱� �޷� ȯ�� ����
		System.out.println("�鸸���� $"+CurrencyConverter.toDollar(1000000)+"�Դϴ�.");
		System.out.println("$100�� "+CurrencyConverter.toKWR(100)+"���Դϴ�.");
		sc.close();
	}
}
