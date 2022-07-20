package chapter03;

import java.util.Scanner;

public class ArrayMin {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("양수를 7개를 입력하세요");
      int intArray [] = new int[7];
      intArray[0] = scan.nextInt();
      int min = intArray[0];
      
      for (int i = 1; i < 7; i++) {
         intArray[i]= scan.nextInt();
         if (intArray[i] < min) {
            min = intArray[i];
         }
      }
      System.out.print("가장 작은 수는 "+min+"입니다");
      scan.close();
   }
}