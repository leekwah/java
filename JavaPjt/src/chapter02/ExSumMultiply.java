package chapter02;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("3의 자리 정수 입력 (100~999) >>");
		int x = scan.nextInt();
		int hundred = x/100; // 100으로 나누면, 몫으로 100의 자리 숫자를 얻을 수 있다.
		int ten =  (x%100)/10; // 100으로 나눈 나머지를 10으로 나누면 십의 자리를 얻는다.
		int one = x%10; // 10으로 나누면 일의 자리를 얻을 수 있다.
		
		System.out.println(hundred);
		System.out.println(ten);
		System.out.println(one);
		
		System.out.println("100의 자리와 10의 자리의 합은 : "+(hundred+ten));
		System.out.println("10의 자리와 1의 자리의 곱은 : "+(ten*one));
		
		scan.close();
	}
}