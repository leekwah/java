package chapter02;

import java.util.Scanner;

// ������ �г��� �Է¹޾Ƽ� 60�� �̻��̸� �հ�, �̸� ���հ�
// 4�г��� ��� 70�� �̻� �հ�
public class NestedIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. (0~100) >>");
		int score = scan.nextInt();
		System.out.print("�г��� �Է��ϼ���. (1~4) >>");
		int grade = scan.nextInt();
		
		if (score >= 60) {
			if (grade != 4) {
				System.out.println("�հ��Դϴ�.");
			} else if (score >= 70) {
				System.out.println("�հ��Դϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
		} else {
		System.out.println("���հ��Դϴ�.");
		}
		scan.close();
	}
}