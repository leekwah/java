package chapter02;

import java.util.Scanner;

// 점수와 학년을 입력받아서 60점 이상이면 합격, 미만 불합격
// 4학년인 경우 70점 이상 합격
public class NestedIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요. (0~100) >>");
		int score = scan.nextInt();
		System.out.print("학년을 입력하세요. (1~4) >>");
		int grade = scan.nextInt();
		
		if (score >= 60) {
			if (grade != 4) {
				System.out.println("합격입니다.");
			} else if (score >= 70) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
		System.out.println("불합격입니다.");
		}
		scan.close();
	}
}
