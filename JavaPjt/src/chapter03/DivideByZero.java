package chapter03;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("���ڸ� �Է��Ͻÿ� :");
		dividend = scan.nextInt();
		System.out.print("���ڸ� �Է��Ͻÿ� :");
		divisor = scan.nextInt();
		
		System.out.println(dividend+"�� "+divisor+"�� ������ "+(dividend/divisor)+"�Դϴ�.");
		scan.close();
		
		
		
	}
}