package chapter02;

import java.util.Scanner;

public class ExArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if (z!=0) {
			System.out.println("��ٸ����� ���̴� "+((x+y)*z)/2.0);			
		} else {
			System.out.println("�ﰢ���� ���̴� "+(x*y)/2.0);
		}
		scan.close();
	}
}