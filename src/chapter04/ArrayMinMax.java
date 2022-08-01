package chapter04;

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 생성
        int intArray[] = new int[10];
        // 최소값 최대값을 정하는 건 Integer에 최대, 최소값 속성이 있다.
        //    // Integer.MAX_VALUE = 최대값, Integer.MIN_VALUE = 최소값
        int min = Integer.MAX_VALUE;
        int max = 0;


        System.out.println("양수를 10개를 입력하세요");
        for(int i = 0; i < intArray.length;i++) {
            intArray[i] = sc.nextInt();
            if(intArray[i] < min) {
                min = intArray[i];
            } else if(intArray[i] > max) {
                max = intArray[i];
            }
        }

        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);
        System.out.println("최소값 + 최대값은 "+(min+max)+" 입니다.");

        sc.close();
    }
}