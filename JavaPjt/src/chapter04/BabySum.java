package chapter04;

public class BabySum {
   public static void main(String[] args) {
      int baby[][]=new int[120][5];
      int sum=0;
      
      for (int month = 0; month < baby.length; month++) {
         for (int country = 0; country < baby[month].length; country++) {
            baby[month][country] = (month+1)*100+(month+1);
            sum += baby[month][country];
            System.out.print(baby[month][country]);
            System.out.println(" ");
         }
         System.out.println("=================");
      }
      System.out.println("10년간 5개 나라의 총 신생아수는 "+sum);
   }
}