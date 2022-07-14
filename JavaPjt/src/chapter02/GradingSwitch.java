package chapter02;

import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char grade;
		System.out.print("점수를 입력하세요 (0~100) >> ");
		int score = scan.nextInt();
		
		switch (score/10) {
			case 10:
				grade = 'A';
				break;
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			//값이 나오지 않으면 default값이 나온다.
			default: 
				grade = 'F';
				break;
		}
		System.out.println("학점은 "+grade+"입니다.");
		scan.close();
	}
}