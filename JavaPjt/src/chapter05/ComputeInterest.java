package chapter05;

import java.util.Scanner;

public class ComputeInterest {

	public static void main(String[] args) {
		int principal;
		double rate;
		double balance;
		int years = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		principal = sc.nextInt();
		System.out.print("�������� �Է��ϼ��� : ");
		rate = sc.nextDouble();
		
		System.out.println("������\t������");
	      
		balance = principal;
		System.out.println("\n������\t������");
		
		do {
			years++;
			balance = balance * (1.0 + rate / 100.0);
			System.out.println(years+"\t"+balance);
		} while (balance <= principal * 2.0);
			System.out.println("\n�ʿ��� ������ = "+years);
//		
//	      for (years = 1; years < 100; years++) {
//	         balance = balance * (1.0 + rate / 100.0);
//	         System.out.println(years+"\t"+balance);
//	         
//	         if (balance <= (principal*2)) {
//	            continue;
//	         }else {
//	        	System.out.println("�ʿ��� ���� "+years+"��"); 
//	        	sc.close();
//	            break;
//	         }
//	      }
		sc.close();
	}
}
