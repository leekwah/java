package chapter03;

import java.util.Scanner;

// �ݺ��� ���� ������ �Է�, ������, -1 �Է� ����
public class WhileExample {
	public static void main(String[] args) {
		int count = 0, sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int n = scan.nextInt();
		// n�� -1�� �ƴ� �� ���� �ݺ�
		while (n != -1) {
			sum += n;
			count++;
			n = scan.nextInt(); // �ݺ��� �ȿ� ��ĳ�ʸ� ���� �� -> ��� �Է� ����
		}
		
		if (count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		} else {
			System.out.println("������ ������ "+count+"���̸�.");
			System.out.println("����� "+(double)sum/count+"�Դϴ�.");
		}
		scan.close();
	}
}