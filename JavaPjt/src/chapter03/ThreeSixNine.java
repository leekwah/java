package chapter03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		int res, num, cnt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하시오>>");
		num = scan.nextInt();
		if (1<=num && num<=99) {
			res = num/10;
			if(res == 3 || res==6 || res==9) cnt++;
			res = num%10;
			if(res == 3 || res==6 || res==9) cnt++;
			if(cnt==1) System.out.println("박수짝");
			else if (cnt == 2) System.out.println("박수짝짝");
			else System.out.println("3,6,9없음");
		}
		else {
			System.out.println("슛자가 범위 벗어남");
		}
		scan.close();
	}
}