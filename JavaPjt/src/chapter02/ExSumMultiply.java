package chapter02;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("3�� �ڸ� ���� �Է� (100~999) >>");
		int x = scan.nextInt();
		int hundred = x/100; // 100���� ������, ������ 100�� �ڸ� ���ڸ� ���� �� �ִ�.
		int ten =  (x%100)/10; // 100���� ���� �������� 10���� ������ ���� �ڸ��� ��´�.
		int one = x%10; // 10���� ������ ���� �ڸ��� ���� �� �ִ�.
		
		System.out.println(hundred);
		System.out.println(ten);
		System.out.println(one);
		
		System.out.println("100�� �ڸ��� 10�� �ڸ��� ���� : "+(hundred+ten));
		System.out.println("10�� �ڸ��� 1�� �ڸ��� ���� : "+(ten*one));
		
		scan.close();
	}
}