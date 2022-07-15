package chapter03;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
//		trynumber: 암호 입력 횟수	
//		1.- 암호를 'myongji60'으로 초기화한다.
//		trynumber = trynumber + 1
//		-  input이 password와 같다면 "환영합니다"를 출력하고 종료한다
//		- "암호가 틀립니다"를 출력한다.
//		- trynumber가 3이라면 "접속을 거부합니다" 를 출력하고 종료한다
		int trynumber = 0;
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("암호를 입력하세요.");
//		
//		if (input.equals(password)) {
//			System.out.println("환영합니다.");
//		} else if (trynumber<2) {
//			System.out.println("");
//			trynumber = trynumber + 1;
//			scan.close();
//			return;
//		} else {
//			System.out.println("");
//		}
		
			
		String password = "myungji60";
		String input = "";
		boolean success = false; // 어떤 상태를 의미하는 변수 (flag)
	
		for (int i=0; i<3; i++) {
			System.out.print("비밀번호를 입력하세요>>>");
			input = scan.next();
			
			if (input.equals(password)) {
				success = true;
			else {
					System.out.println("암호가 틀립니다.")
			}
			}
			}
		}
		
		if(success){
			System.out.println("성공");	
		} else {
		System.out.println("접속을 거부합니다.");
	}
		scan.close();
	}
}
