package chapter05;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� >> ");
		int money = sc.nextInt();
		for (int i = 0; i < unit.length; i++) {
			int res = money/unit[i];
			money = money%unit[i];
	         
			if (res > 0) {
				System.out.println(unit[i]+"�� ¥�� : "+res+"��");
				money = money%unit[i];
			}
		}
		sc.close();
	}
}