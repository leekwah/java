package chapter03;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
        int line = scan.nextInt();
        
        for(int i=line-1; i>=0; i--) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		scan.close();
	}
}
