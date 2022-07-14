package chapter02;

import java.util.Scanner;

public class ExMaxMin_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력 >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (x>y && y>z) {
			max = x;
		} else if (y>x && x>z) {
			max = y;
		} else if (z>x && z>y) {
			max = z;
		}
		
		if (x<y && x<z) {
			min = x;
		} else if (y<x && y<z) {
			min = y;
		} else if (z<x && z<y) {
			min = z;
		}
		
		System.out.println("최대값은"+max);
		System.out.println("최대값은"+min);
		
		scan.close();
	}
}
