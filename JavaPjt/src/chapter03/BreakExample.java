package chapter03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		
		while (true) { // true로 무한 반복을 걸었음
			System.out.print(">>"); // >> 이것도 계속 나와야 하는 것
			String text = scan.next(); // 입력 받는 것
			
			if (text.equals("exit")) { // exit면
				break; // break
			} // 그렇지 않으면 무한반복
		}
		System.out.println("종료합니다.");
		scan.close();
	}
}
