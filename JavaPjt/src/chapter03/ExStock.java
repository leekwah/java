package chapter03;

import java.util.Scanner;

public class ExStock {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("코스피 지수를 입력하세요(1800~2500): ");
      int kospi = scan.nextInt();
      System.out.print("환율 입력하세요(1100~1200): ");
      int rate = scan.nextInt();
      
      if (rate < 1150) {
    	  if (kospi >= 2300) {
  			System.out.println("상승장");
  		} else if (kospi >= 2000) {
  			System.out.println("횡보장");
  		} else {
  			System.out.println("하락장");
  		}
	} else {
		if (kospi >= 2200) {
			System.out.println("상승장");
		} else if (kospi >= 2000) {
			System.out.println("횡보장");
		} else {
			System.out.println("하락장");
		}
	}   
      scan.close();
   }
}