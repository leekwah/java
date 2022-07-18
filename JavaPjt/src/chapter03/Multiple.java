package chapter03;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		// scan : 키보드로부터 데이터를 읽어들이기 위해 필요한 변수, 
		// number : 입력받은 양의 정수, 
		// multiple : 배수 여부 확인
		
		int number;
		boolean multiple = false;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요 : ");
		number = scan.nextInt();
		
		if(number %3 == 0) {
			System.out.print("3의 배수이다.");
			multiple=true;
		} 
		if(number %5 == 0) {
			System.out.print("5의 배수이다.");
			multiple=true;
		} 
		if(number %8 == 0) {
			System.out.print("8의 배수이다.");
			multiple=true;
		} 
		
		if (!multiple) {
			System.out.print("어느 배수도 아니다.");
		}
		
		scan.close();
	}	
}
