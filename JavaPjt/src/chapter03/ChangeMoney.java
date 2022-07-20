package chapter03;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int money = scan.nextInt();
		int moneyminus = money-50000;
		int fiftythousand = money/50000;
		int tenhousand = (moneyminus*fiftythousand)/10000;
		int thousand = ((moneyminus*fiftythousand)-10000*tenhousand)/1000;
		int hundred = (((moneyminus*fiftythousand)-10000*tenhousand)-1000*thousand)/100;
		int fifty = ((((moneyminus*fiftythousand)-10000*tenhousand)-1000*thousand)-100*hundred)/50;
		int ten = (((((moneyminus*fiftythousand)-10000*tenhousand)-1000*thousand)-100*hundred)-50*fifty)/10;
		int one = (((((moneyminus*fiftythousand)-10000*tenhousand)-1000*thousand)-100*hundred)-50*fifty)%10;
		
		
		if (money>=50000) {
			System.out.println("오만원권 "+fiftythousand+"매"+" 만원 권 "+tenhousand+"매 "+" 천원권 "+thousand+"매"+" 백원 "+hundred+"개"+" 오십원 "+fifty+"개"+" 십원 "+ten+"개"+" 일원 "+one+"개");
		} else if (money >= 10000) {
			System.out.println("만원 권 "+tenhousand+"매 "+" 천원권 "+thousand+"매"+" 백원 "+hundred+"개"+" 오십원 "+fifty+"개"+" 십원 "+ten+"개"+" 일원 "+one+"개"
					);
		} else if (money < 10000) {System.out.println("천원권 "+thousand+"매"+" 백원 "+hundred+"개"+" 오십원 "+fifty+"개"+" 십원 "+ten+"개"+" 일원 "+one+"개");
		};
		scan.close();
	}

}
