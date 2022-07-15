package chapter03;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� >> ");
		int x = scan.nextInt();
		String op = scan.next();
		int y = scan.nextInt();
		int result = 0;
		
		switch (op) {
			case "+":
				result = x + y;
				break;
			case "-":
				result = x - y;
				break;
			case "*":
				result = x * y;
				break;
			case "/":
				if (y==0) {
					System.out.println("0���� ���� �� �����ϴ�.");
					scan.close();
					return;
				} else
				result = x / y;
				break;
		default:
			System.out.print("��Ģ������ �ƴմϴ�.");
			scan.close();
			return;
		}
		System.out.print(x+op+y+"�� ��� ����� "+result+"�Դϴ�.");
		scan.close();
	}
}