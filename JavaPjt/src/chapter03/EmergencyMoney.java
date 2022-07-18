package chapter03;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		final int hundred= 120_000;
		final int ten= 12000;
		int res, money, num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가구수를 입력하시오 >> ");
		num = scan.nextInt(); //num에 따라서 금액이 다름
		
		if (num==1) {
			money= 400_000;
		} else if (num==2) {
			money= 600_000;
		} else if (num==3) {
			money= 800_000;
		} else {
			money= 1_000_000;
		} 
		
		res = money/hundred;
		money = money%hundred;
		if (res > 0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		
		res = money/ten;
		if (res > 0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		scan.close();
	} 
}
