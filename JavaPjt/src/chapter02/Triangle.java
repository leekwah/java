package chapter02;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ� >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if (x+y>z && x+z>y && y+z>x) {
			System.out.println("�ﰢ���� �����մϴ�.");
		} else {
			System.out.println("�ﰢ���� �Ұ����մϴ�.");
		}
		scan.close();
	}
}