package chapter02;

import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char grade;
		System.out.print("������ �Է��ϼ��� (0~100) >> ");
		int score = scan.nextInt();
		
		switch (score/10) {
			case 10:
				grade = 'A';
				break;
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			//���� ������ ������ default���� ���´�.
			default: 
				grade = 'F';
				break;
		}
		System.out.println("������ "+grade+"�Դϴ�.");
		scan.close();
	}
}