package chapter02;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 3�� �Է� >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (x > y && y > z) {
			max = x; min = z;
			System.out.println("�ִ밪�� "+x+"�̰�, �ּҰ��� "+z+"�̴�.");
		} else if (y > x && x > z) {
			max = y; min = z;
			System.out.println("�ִ밪�� "+y+"�̰�, �ּҰ��� "+z+"�̴�.");
		} else if (z > y && y > x) {
			max = z; min = x;
			System.out.println("�ִ밪�� "+z+"�̰�, �ּҰ��� "+x+"�̴�.");
		} else if (z > z && z > y) {
			max = x; min = y;
			System.out.println("�ִ밪�� "+x+"�̰�, �ּҰ��� "+y+"�̴�.");
		}else if (z > x && x > y) {
			max = z; min = y;
			System.out.println("�ִ밪�� "+z+"�̰�, �ּҰ��� "+y+"�̴�.");
		}else if (x > z && z > y) {
			max = x; min = y;
			System.out.println("�ִ밪�� "+x+"�̰�, �ּҰ��� "+y+"�̴�.");
		}
		scan.close();
	}
}
