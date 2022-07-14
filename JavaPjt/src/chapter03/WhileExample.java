package chapter03;

import java.util.Scanner;

// 반복문 정수 여러개 입력, 평균출력, -1 입력 종료
public class WhileExample {
	public static void main(String[] args) {
		int count = 0, sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scan.nextInt();
		// n이 -1이 아닐 때 까지 반복
		while (n != -1) {
			sum += n;
			count++;
			n = scan.nextInt(); // 반복문 안에 스캐너를 넣은 것 -> 계속 입력 받음
		}
		
		if (count == 0) {
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.println("정수의 갯수는 "+count+"개이며.");
			System.out.println("평균은 "+(double)sum/count+"입니다.");
		}
		scan.close();
	}
}