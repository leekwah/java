package chapter05;

import java.util.Scanner;

public class ComputeInterest {

	public static void main(String[] args) {
		int principal;
		double rate;
		double balance;
		int years = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원금을 입력하세요 : ");
		principal = sc.nextInt();
		System.out.print("연이율을 입력하세요 : ");
		rate = sc.nextDouble();
		
		System.out.println("연도수\t원리금");
	      
		balance = principal;
		System.out.println("\n연도수\t원리금");
		
		do {
			years++;
			balance = balance * (1.0 + rate / 100.0);
			System.out.println(years+"\t"+balance);
		} while (balance <= principal * 2.0);
			System.out.println("\n필요한 연도수 = "+years);
//		
//	      for (years = 1; years < 100; years++) {
//	         balance = balance * (1.0 + rate / 100.0);
//	         System.out.println(years+"\t"+balance);
//	         
//	         if (balance <= (principal*2)) {
//	            continue;
//	         }else {
//	        	System.out.println("필요한 연도 "+years+"년"); 
//	        	sc.close();
//	            break;
//	         }
//	      }
		sc.close();
	}
}
