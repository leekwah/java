package chapter03;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		// scan : Ű����κ��� �����͸� �о���̱� ���� �ʿ��� ����, 
		// number : �Է¹��� ���� ����, 
		// multiple : ��� ���� Ȯ��
		
		int number;
		boolean multiple = false;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		number = scan.nextInt();
		
		if(number %3 == 0) {
			System.out.print("3�� ����̴�.");
			multiple=true;
		} 
		if(number %5 == 0) {
			System.out.print("5�� ����̴�.");
			multiple=true;
		} 
		if(number %8 == 0) {
			System.out.print("8�� ����̴�.");
			multiple=true;
		} 
		
		if (!multiple) {
			System.out.print("��� ����� �ƴϴ�.");
		}
		
		scan.close();
	}	
}
