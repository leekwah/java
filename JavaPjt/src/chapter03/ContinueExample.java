package chapter03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 5���� �Է��ϼ���.");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = scan.nextInt();
				if(n<=0) {
					continue;
				}  else {
					sum += n;
				}
		}
		System.out.println("����� ���� "+ sum);
		scan.close();
	}
}