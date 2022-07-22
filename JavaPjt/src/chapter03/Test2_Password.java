package chapter03;

import java.util.Scanner;

public class Test2_Password {
	public static void main(String[] args) {
//		trynumber: 암호 입력 횟수	
//		1.- 암호를 'myongji60'으로 초기화한다.
//		trynumber = trynumber + 1
//		-  input이 password와 같다면 "환영합니다"를 출력하고 종료한다
//		- "암호가 틀립니다"를 출력한다.
//		- trynumber가 3이라면 "접속을 거부합니다" 를 출력하고 종료한다

      String password="myongji60";
      String input;
      int tryNumber=0;
      Scanner scan=new Scanner(System.in);
      
      while (true) {
         System.out.print("암호를 입력하세요: ");
         input = scan.next();
         tryNumber++;
         
         if (input.equals(password)) {
            System.out.println("환영합니다.");
            break;
         }
         System.out.println("암호가 틀립니다.");
         
         if (tryNumber ==3) {
            System.out.println("접속을 거부합니다.");
            break;
         }
      }
      scan.close();
   }
}
