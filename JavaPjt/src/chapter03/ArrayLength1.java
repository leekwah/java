package chapter03;

import java.util.Scanner;

public class ArrayLength1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요 >> ");
		int sum = 0;
		double avg = 0;
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
			avg = sum/arr.length;
		}
		System.out.println("총 합은 "+sum);
		System.out.println("평균은 "+avg);
		scan.close();
	}
}
