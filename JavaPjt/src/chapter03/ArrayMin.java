package chapter03;

import java.util.Scanner;

public class ArrayMin {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("����� 7���� �Է��ϼ���");
      int intArray [] = new int[7];
      intArray[0] = scan.nextInt();
      int min = intArray[0];
      
      for (int i = 1; i < 7; i++) {
         intArray[i]= scan.nextInt();
         if (intArray[i] < min) {
            min = intArray[i];
         }
      }
      System.out.print("���� ���� ���� "+min+"�Դϴ�");
      scan.close();
   }
}