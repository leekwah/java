package chapter03;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		int time = scan.nextInt();
		
		int hour = (time/60)/60;
		int minute = (time/60)%60;
		int second = time%60;
		System.out.println(time+"�ʴ� "+hour+"�ð�"+minute+"��"+second+"�� �Դϴ�.");
		scan.close();
	}
}
