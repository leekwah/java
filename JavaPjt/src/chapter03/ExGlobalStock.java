package chapter03;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ż��ݾ��� �Է��ϼ��� : ");
		int purchaseAmount = scan.nextInt();
		System.out.print("�ŵ��ݾ��� �Է��ϼ��� : ");
		int salesAmount = scan.nextInt();
		double tax = 0;
		
		if (purchaseAmount<salesAmount) {
			tax = (salesAmount - purchaseAmount) * 0.22;
		} else {
			tax = 0;
		}
		System.out.println("�絵���� "+tax);
		scan.close();
	}
}
