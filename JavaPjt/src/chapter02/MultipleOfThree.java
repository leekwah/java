package chapter02;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ� >> ");
		int num = a.nextInt();
		
		if (num%3==0) {
			System.out.println("3�� ����Դϴ�.");
		} else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		a.close();
	}

}