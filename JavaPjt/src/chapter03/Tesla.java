package chapter03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		int tesla = 520;
		int res;
		int money;
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오 >> ");
		num = scan.nextInt();
		money = tesla * num;
		
		res = money/100; // 100달러 짜리
		money = money%100;
		if (res > 0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		
		res = money/10; // 10달러 짜리
		if (res > 0) {
			System.out.println("10달러짜리 "+res+"매");
		}
		scan.close();
	}
}
