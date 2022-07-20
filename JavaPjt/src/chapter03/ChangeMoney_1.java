package chapter03;

import java.util.Scanner;

public class ChangeMoney_1 {
	// 여기에 변수를 넣으면 전역변수
	final static int 오만원 = 50000;
	final static int 만원 = 10000;
	final static int 오천원 = 5000;
	final static int 천원 = 1000;
	final static int 오백원 = 500;
	final static int 백원 = 100;
	final static int 오십원 = 50;
	final static int 십원 = 10;
	final static int 일원 = 1;
	
	public static void main(String[] args) {
		// 여기에 넣으면 지역변수
		int res, money;
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		money = scan.nextInt();
		
		res = money/오만원; // 0보다 크다면, 오만원권이 있다는 것이다.
		money = money%오만원;
		if (res > 0) {
			System.out.println("오만원권"+res+"매");
		}
		
		res = money/만원;
		money = money%만원;
		if (res > 0) {
			System.out.println("만원"+res+"매");
		}
		
		res = money/오천원;
		money = money%오천원;
		if (res > 0) {
			System.out.println("오천원"+res+"매");
		}
		
		res = money/천원;
		money = money%천원;
		if (res > 0) {
			System.out.println("천원"+res+"매");
		}
		
		res = money/오백원;
		money = money%오백원;
		if (res > 0) {
			System.out.println("오백원"+res+"매");
		}
		
		res = money/백원;
		money = money%백원;
		if (res > 0) {
			System.out.println("백원"+res+"매");
		}
		
		res = money/오십원;
		money = money%오십원;
		if (res > 0) {
			System.out.println("오십원"+res+"매");
		}
		
		res = money/십원;
		money = money%십원;
		if (res > 0) {
			System.out.println("십원"+res+"매");
		}
		
		res = money/일원;
		money = money%일원;
		if (res > 0) {
			System.out.println("일원"+res+"매");
		}
		scan.close();
	}
}
