package chapter03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	// 정수가 아닌 것일 때의 오류 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요 ");
		int sum = 0, n =0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i+">>");
			try {
				n = scan.nextInt();
//				if (n == 9 ) {
//					scan.next(); // 9를 넣으면 넘김, 그리고 그 다음 것도 넘김
//					i--; 
//					continue;
//				}
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
				scan.next();
				i--; // 잘못되었을 때, i--를 해야지 증가되지 않고 계속 되기 때문에 
				continue; // continue를 주석하면, 앞에 더했던 것들이 두 번 더해지게 된다.
			}
			sum += n;
		}
		
		System.out.println("합은 "+sum);
		scan.close();
	}

}
