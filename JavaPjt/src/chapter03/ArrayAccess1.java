package chapter03;

import java.util.Scanner;

public class ArrayAccess1 {
	public static void main(String[] args) {
		int[] arrage = new int[5];
		int max = arrage[0]; 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��� 5���� �Է��ϼ���.");
		
		for (int i = 0; i < arrage.length; i++) {
			arrage[i] = scan.nextInt();
			
			if(arrage[i] > max) { 
				max = arrage[i]; 
			} 
		}
		
		System.out.println("�ִ밪 :" + max);     
		scan.close();
	}
}
