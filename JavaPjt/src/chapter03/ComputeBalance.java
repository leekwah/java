package chapter03;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("구매금액을 입력하세요 : ");
		int purchaseAmount = scan.nextInt();
		int balance = 0;
		
		if (purchaseAmount>=300_000) {
			balance = purchaseAmount - 30_000;
		} else if (purchaseAmount>=100_000) {
			balance = purchaseAmount - 5_000;
		} else {
			balance = purchaseAmount;
		}
		System.out.println("구매금액 = "+purchaseAmount);
		System.out.println("청구금액 = "+balance);
		scan.close();
	}
}
