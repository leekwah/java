package chapter03;

import java.util.Scanner;

public class ArrayLength1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("5���� ������ �Է��ϼ��� >> ");
		int sum = 0;
		double avg = 0;
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
			avg = sum/arr.length;
		}
		System.out.println("�� ���� "+sum);
		System.out.println("����� "+avg);
		scan.close();
	}
}
