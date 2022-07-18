package chapter03;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		int[] arrage = new int[5];
		int max = arrage[0]; 
		int min = arrage[0]; 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양수 5개를 입력하세요.");
		
		arrage[0] = scan.nextInt();
		arrage[1] = scan.nextInt();
		arrage[2] = scan.nextInt();
		arrage[3] = scan.nextInt();
		arrage[4] = scan.nextInt();
		
		for (int i = 0; i < arrage.length; i++) {
			if(arrage[i] >= max) { 
				max = arrage[i]; 
			} else if(arrage[i] < min) { 
				min = arrage[i]; 
			} 
		}
		
		System.out.println("최대값 :" + max);     
		scan.close();
	}
}
