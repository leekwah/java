package chapter03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while (true) { // true�� ���� �ݺ��� �ɾ���
			System.out.print(">>"); // >> �̰͵� ��� ���;� �ϴ� ��
			String text = scan.next(); // �Է� �޴� ��
			
			if (text.equals("exit")) { // exit��
				break; // break
			} // �׷��� ������ ���ѹݺ�
		}
		System.out.println("�����մϴ�.");
		scan.close();
	}
}
