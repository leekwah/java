package chapter02;

import java.util.Scanner;

public class ExArea2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if (z==0) {
			float triangle = (x*y)/2;
			System.out.println("�ﰢ���� ���̴� "+triangle);
		} else {
			float trapezium =((x+y)*z)/2;
			System.out.println("��ٸ����� ���̴� "+trapezium);			
		}
		scan.close();
	}
}