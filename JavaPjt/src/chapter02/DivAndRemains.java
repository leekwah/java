package chapter02;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리수 정수 입력 >> ");
		int x = scan.nextInt();
		
		if (x%10 == x/10) {
			System.out.println("YES! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");
		}
		scan.close();
	}
}
