package chapter03;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("매수금액을 입력하세요 : ");
		int purchaseAmount = scan.nextInt();
		System.out.print("매도금액을 입력하세요 : ");
		int salesAmount = scan.nextInt();
		double tax = 0;
		
		if (purchaseAmount<salesAmount) {
			tax = (salesAmount - purchaseAmount) * 0.22;
		} else {
			tax = 0;
		}
		System.out.println("양도세는 "+tax);
		scan.close();
	}
}
