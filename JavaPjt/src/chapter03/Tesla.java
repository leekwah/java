package chapter03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		int tesla = 520;
		int res;
		int money;
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ż� ������ �Է��Ͻÿ� >> ");
		num = scan.nextInt();
		money = tesla * num;
		
		res = money/100; // 100�޷� ¥��
		money = money%100;
		if (res > 0) {
			System.out.println("100�޷�¥�� "+res+"��");
		}
		
		res = money/10; // 10�޷� ¥��
		if (res > 0) {
			System.out.println("10�޷�¥�� "+res+"��");
		}
		scan.close();
	}
}
