package chapter02;

import java.util.Scanner;

public class ExExchange {

	public static void main(String[] args) {
		final double DOL = 1200.0;
		final double EUR = 1500.0;
		Scanner a = new Scanner(System.in);
		System.out.print("원화를 입력하세요 >> ");
		int won = a.nextInt();
		double dollar = won / DOL;
		double euro = won / EUR;
		System.out.println(won+"원은 "+dollar+"달러 입니다.");
		System.out.println(won+"원은 "+euro+"유로 입니다.");
		a.close();
	}
}
