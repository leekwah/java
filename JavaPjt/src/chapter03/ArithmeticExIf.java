package chapter03;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� >> ");
		int x = scan.nextInt();
		String op = scan.next();
		int y = scan.nextInt();
		int result = 0;
		
		if (op.equals("+")) {
			result = x + y;
		} else if (op.equals("-")) {
			result = x - y;
		} else if (op.equals("*")) {
			result = x * y;
		} else if (op.equals("/")) {
			if (y==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				scan.close();
				return;
			} else {
				result = x / y;
			}
		} else {
			System.out.println("��Ģ ������ �ƴմϴ�.");
		}
		System.out.println(x+op+y+"�� �������� "+result);
		scan.close();
	}
}
