package chapter03;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		final int hundred= 120_000;
		final int ten= 12000;
		int res, money, num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� �Է��Ͻÿ� >> ");
		num = scan.nextInt(); //num�� ���� �ݾ��� �ٸ�
		
		if (num==1) {
			money= 400_000;
		} else if (num==2) {
			money= 600_000;
		} else if (num==3) {
			money= 800_000;
		} else {
			money= 1_000_000;
		} 
		
		res = money/hundred;
		money = money%hundred;
		if (res > 0) {
			System.out.println("100�޷�¥�� "+res+"��");
		}
		
		res = money/ten;
		if (res > 0) {
			System.out.println("100�޷�¥�� "+res+"��");
		}
		scan.close();
	} 
}
