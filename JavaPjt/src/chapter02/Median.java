package chapter02;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 3�� �Է� >>> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int median = x;
		
		if (x>y && y>z || z>y && y>x) {
//			System.out.println("�߰� ���� "+y+"�Դϴ�");
			median = y;
		} else if (y>x && x>z || z>x && x>y){
//			System.out.println("�߰� ���� "+x+"�Դϴ�");
			median = x;
		} else {
			median = z;
		}
		System.out.println("�߰� ���� "+median+"�Դϴ�");
		scan.close();
	}
}