package chapter02;

import java.util.Scanner;

public class DivAndRemains_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է� >> ");
		int x = scan.nextInt();
		int ten = x/10;
		int one = x%10;
		
		if (ten == one) {
			System.out.println("YES! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		} else {
			System.out.println("NO! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		scan.close();
	}
}