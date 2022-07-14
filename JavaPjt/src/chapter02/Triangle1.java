package chapter02;

import java.util.Scanner;

public class Triangle1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오 >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if ((x+y)<=z || (x+z)<=y || (y+z)<=x) {
			System.out.println("삼각형이 불가능합니다.");
		} else {
			System.out.println("삼각형이 가능합니다.");
		}
		scan.close();
	}
}
