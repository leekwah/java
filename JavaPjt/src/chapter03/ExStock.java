package chapter03;

import java.util.Scanner;

public class ExStock {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("�ڽ��� ������ �Է��ϼ���(1800~2500): ");
      int kospi = scan.nextInt();
      System.out.print("ȯ�� �Է��ϼ���(1100~1200): ");
      int rate = scan.nextInt();
      
      if (rate < 1150) {
    	  if (kospi >= 2300) {
  			System.out.println("�����");
  		} else if (kospi >= 2000) {
  			System.out.println("Ⱦ����");
  		} else {
  			System.out.println("�϶���");
  		}
	} else {
		if (kospi >= 2200) {
			System.out.println("�����");
		} else if (kospi >= 2000) {
			System.out.println("Ⱦ����");
		} else {
			System.out.println("�϶���");
		}
	}   
      scan.close();
   }
}