package chapter02;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��ϼ���. >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if ((100<=x && x<=200) && (100<=y && y<=200)) {
			System.out.println("�� ("+x+", "+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		} else {
			System.out.println("�� ("+x+", "+y+")�� �簢���� �����ϴ�.");
		}
		scan.close();
	}
}