package chapter03;

import java.util.Scanner;

public class ArrayMin_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[7];
		int min = 0;
		System.out.println("양수 7개를 입력하세요.");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
			if (i == 0) {
				min = intArray[i];
			} else {
				if (intArray[i] < min) {
					min = intArray[i];
				} 
			}
		}
		System.out.println("최소값은 "+min+"입니다.");
		scan.close();
	}
}
