package chapter02;

import java.util.Scanner;

//백의 자리와 십의 자리는 합하고, 10의 자리와 1의 자리를 곱하기를 하는 프로그램을 출력하라
public class ExSumMultiply_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("3의 자리 정수 입력 (100~999) >>");
		int x = scan.nextInt();
		int hundred = x/100; // 1출력
		int hundredRest = x%100;
//		int hundredRest = x/10;
//		int hundredRest = x%10; 
		int ten = hundredRest/10;
		int one = hundredRest%10;
//		int ten = (x%100)/10;
//		int one = x%10;
		
		System.out.println(hundred);
		System.out.println(ten);
		System.out.println(one);
		
		System.out.println("100의 자리와 10의 자리의 합은 : "+(hundred+ten));
		System.out.println("10의 자리와 1의 자리의 곱은 : "+(ten*one));
		
		scan.close();
	}
}
