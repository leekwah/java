package chapter03;

import java.util.Scanner;

public class ThreeSixNine2 {
	public static void main(String[] args) {
		int num, count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("10~99사이의 정수를 입력하시오>>");
		num = scan.nextInt();
		
		int a,b;
		a = num/10;
		b = num%10;
		
		if (a%3==0) {
			count++;
		}
		if (b%3==0 && b!=0) {
			count++;
		}
		
		if (count==2) {
			System.out.println("박수짝짝");
		} else if (count==1) {
			System.out.println("박수짝");
		} else {
			System.out.println(num);
		}
		scan.close();
	}
}
