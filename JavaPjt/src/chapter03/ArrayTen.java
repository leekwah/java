package chapter03;

import java.util.Scanner;

public class ArrayTen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[10];
		int sum = 0;
		System.out.println("���� 10���� �Է��ϼ���.");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
				sum += intArray[i];
		}
		System.out.println("�հ��"+sum+"�Դϴ�.");
		scan.close();
	}

}