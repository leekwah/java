package chapter03;

import java.util.Scanner;

public class ArrayTen_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[10];
		int sum = 0;
		System.out.println(intArray.length+"개를 입력하세요.");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
				sum += intArray[i];
		}
		System.out.println("합계는"+sum+"입니다.");
		scan.close();
	}

}
