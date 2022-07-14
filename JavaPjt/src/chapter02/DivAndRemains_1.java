package chapter02;

import java.util.Scanner;

public class DivAndRemains_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리수 정수 입력 >> ");
		int x = scan.nextInt();
		int ten = x/10;
		int one = x%10;
		
		if (ten == one) {
			System.out.println("YES! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");
		}
		scan.close();
	}
}
