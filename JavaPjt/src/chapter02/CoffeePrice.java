package chapter02;

import java.util.Scanner;

public class CoffeePrice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� Ŀ�Ǹ� �帱���? (����������, �Ƹ޸�ī��, ī���, īǪġ�� �� �����ϼ���)");
		// ������ order
		String order = scan.next();
		int price = 0;
		
		switch (order) {
			case "����������": case "�Ƹ޸�ī��":
				price = 2000;
				break;
			case "ī���":
				price = 3000;
				break;
			case "īǪġ��":
				price = 3500;
				break;
	
			default:
				System.out.println("�޴��� �����ϴ�.");
				break;
		}
		// �޴��� ���� �͵� 0���̶�� ������ ������, if�� !=0 �� ����, ������ ������ �Ѵ�.
		if (price !=0) {
		System.out.println(order+"�� "+price+"�� �Դϴ�.");
		}
		scan.close();
	}
}