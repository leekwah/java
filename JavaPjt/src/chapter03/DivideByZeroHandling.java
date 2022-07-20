package chapter03;

import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dividend;
		int divisor;

		// �ݺ��� ���ѹݺ�
		while (true) {
			System.out.print("���ڸ� �Է��Ͻÿ� :");
			dividend = scan.nextInt();
			System.out.print("���ڸ� �Է��Ͻÿ� :");
			divisor = scan.nextInt();
			
			try {
				System.out.println(dividend+"�� "+divisor+"�� ������ "+(dividend/divisor)+"�Դϴ�.");
				break; // break�� ���� ������, ������ ������ ������ �� ���� ���ƾ��Ѵ�.
				// 0���� ������ "java.lang.ArithmeticException" ERROR�� ������ �ȴ�.
				// e�� �޴� �ٴ� ���̴�.
				// �̰� ����ó�� �ϰڴ�.
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���.");
			}
		}
		scan.close();
	}
}