package chapter02;

import java.util.Scanner;

public class Won2Dollar2_1 {
	// main메소드는 {} 전체 괄호 안에 있는 것들이고, main메소드 안에도 메소드가 포함될 수 있다.
	public static void main(String[] args) {
		// RATE는 상수로 쓰는 건 대문자로 쓰는 걸 추천한다.
		// 로직을 많이 쓰는 경우에는 1100을 쓰는 것보단, 상수로 입력해두는 것이 편하다.
		final double RATE = 1100.0;
		Scanner a = new Scanner(System.in);
		System.out.print("원화를 입력하세요 >> ");
		int won = a.nextInt();
		double dollar = won / RATE;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		a.close();
	}
}