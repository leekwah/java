package chapter02;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원화를 입력하세요 >> ");
		int x = s.nextInt();
		float dollar = (float)x / 1100;
		System.out.println("원화는 "+dollar+"달러 입니다.");
	}
}