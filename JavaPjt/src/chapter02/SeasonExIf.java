package chapter02;

import java.util.Scanner;

public class SeasonExIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12) >> ");
		int month = scan.nextInt();
		
		if (3<=month && month<=5) {
			System.out.println("��");
		} else if (6<=month && month<=8) {
			System.out.println("����");
		} else if (9<=month && month<=11) {
			System.out.println("����");
		} else if (month ==12 || month==1 || month==2) {
			System.out.println("�ܿ�");
		}
		else {
			System.out.println("�߸� �Է�");
		}
		scan.close();
	}
}
