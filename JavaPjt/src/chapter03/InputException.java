package chapter03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	// ������ �ƴ� ���� ���� ���� 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ��� ");
		int sum = 0, n =0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i+">>");
			sum += n;
			try {
				n = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
				scan.next();
				continue;
			}
		}
		
		System.out.println("���� "+sum);
		scan.close();
	}

}