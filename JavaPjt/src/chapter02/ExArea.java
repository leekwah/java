package chapter02;

import java.util.Scanner;

public class ExArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if (z!=0) {
			System.out.println("사다리꼴의 넓이는 "+((x+y)*z)/2.0);			
		} else {
			System.out.println("삼각형의 넓이는 "+(x*y)/2.0);
		}
		scan.close();
	}
}
