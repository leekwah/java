package chapter03;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		// �������� ���θ� �Է¹޾� cheating�� �����Ѵ�.
		// cheating : ��������, attendrate : �⼮�� , totalscore : ����, grade : ����
		Scanner scan = new Scanner(System.in);
		System.out.print("������������ (true Ȥ�� false) : ");
		Boolean cheating = scan.nextBoolean();
		System.out.print("�⼮�� (0~100������ ������) : ");
		int attendrate = scan.nextInt();
		System.out.print("���� (0~100������ ������) : ");
		int totalscore = scan.nextInt();
		char grade;
		
		if (cheating) {
			grade = 'F';
		} else if (attendrate < 80) {
			grade = 'F';
		} else { 
			if (totalscore>=90) {
				grade = 'A'; 
			} else if (totalscore>=80) {
				grade = 'B'; 
			} else if (totalscore>=70) {
				grade = 'C'; 
			} else if (totalscore>=60) {
				grade = 'D'; 
			} else {
				grade = 'F'; 
				}
			}
		System.out.println("������ "+grade+"�Դϴ�.");
		scan.close();
	}
}
