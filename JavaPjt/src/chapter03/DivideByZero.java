package chapter03;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("분자를 입력하시오 :");
		dividend = scan.nextInt();
		System.out.print("분자를 입력하시오 :");
		divisor = scan.nextInt();
		
		System.out.println(dividend+"를 "+divisor+"로 나누면 "+(dividend/divisor)+"입니다.");
		scan.close();
		
		
		
	}
}
