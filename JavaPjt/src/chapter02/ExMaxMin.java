package chapter02;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력 >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (x > y && y > z) {
			max = x; min = z;
			System.out.println("최대값은 "+x+"이고, 최소값은 "+z+"이다.");
		} else if (y > x && x > z) {
			max = y; min = z;
			System.out.println("최대값은 "+y+"이고, 최소값은 "+z+"이다.");
		} else if (z > y && y > x) {
			max = z; min = x;
			System.out.println("최대값은 "+z+"이고, 최소값은 "+x+"이다.");
		} else if (z > z && z > y) {
			max = x; min = y;
			System.out.println("최대값은 "+x+"이고, 최소값은 "+y+"이다.");
		}else if (z > x && x > y) {
			max = z; min = y;
			System.out.println("최대값은 "+z+"이고, 최소값은 "+y+"이다.");
		}else if (x > z && z > y) {
			max = x; min = y;
			System.out.println("최대값은 "+x+"이고, 최소값은 "+y+"이다.");
		}
		scan.close();
	}
}
