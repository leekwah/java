package chapter03;

import java.util.Scanner;

public class Tesla_me {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오 >> ");
		int tesla = scan.nextInt();
		int money = 520*tesla;
		int hundred = money/100;
		int ten = (money/10)%10;
		
		if (ten==0) {
			System.out.println("100달러짜리 "+hundred +"매");
		} else {
			System.out.println("100달러짜리 "+hundred +"매");
			System.out.println("10달러짜리 "+ten+"매");
		}
		scan.close();
	}
}