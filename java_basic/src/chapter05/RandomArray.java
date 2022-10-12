package chapter05;
// 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아 (100 이하 개수)
// 정수 배열을 생성하고, 이곳에서 1에서 100까지의 범위를 정수를 랜덤하게 삽입하라.

import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇 개?");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int r = (int)(Math.random()*100+1);
            arr[i] = r;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]+" ");
            } else {
                if (i % 10 == 0) {
                    System.out.println(); // 10줄이 넘어가면 1줄 넘어감
                }
                System.out.print(arr[i]+" ");
            }
        }
        scanner.close();
    }
}
