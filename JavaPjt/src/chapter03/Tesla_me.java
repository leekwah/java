package chapter03;

import java.util.Scanner;

public class Tesla_me {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ż� ������ �Է��Ͻÿ� >> ");
		int tesla = scan.nextInt();
		int money = 520*tesla;
		int hundred = money/100;
		int ten = (money/10)%10;
		
		if (ten==0) {
			System.out.println("100�޷�¥�� "+hundred +"��");
		} else {
			System.out.println("100�޷�¥�� "+hundred +"��");
			System.out.println("10�޷�¥�� "+ten+"��");
		}
		scan.close();
	}
}