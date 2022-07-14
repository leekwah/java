package chapter02;

import java.util.Scanner;

// 임금계산
// 8시간 까지는 시간당 5000원
// 8시간 초과 -> 1.5배 지급

public class Pay {
	public static void main(String[] args) {
		final int RATE = 5000;
		int pay;
		int hours; // 시간을 입력받아서 처리할 것이다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("시간을 입력하시오 : ");
		hours = scan.nextInt();
		// 분기처리를 할 것이다.
		
		if (hours > 8) {
			// 수동형변환 필요하다.
			pay = (int)(RATE * 8 + (1.5 * RATE * (hours - 8)));
		} else {
			pay = RATE * hours;
		}
		System.out.println("임금은 "+pay+"원 입니다.");
		scan.close();
	}
}