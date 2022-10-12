package chapter06;
// 정수를 몇 개 저장할지 키보드로부터 키보드로부터 개수를 입력받아 (100 이하 개수)
// 정수 배열을 생성하고, 이곳에서 1에서 100까지의 범위를 정수를 랜덤하게 삽입하라.
// 배열에는 같은 수가 없도록 하고, 배열을 출력하라.

import java.util.Scanner;


public class RandomArray2 {
    public static boolean exists(int a[], int from, int r) { // 메소드를 생성해서 한다.
        for (int i = 0; i < from; i++) { // from 까지 진행
            if (a[i] == r) { // 배열이 random 수와 같으면
                return true; // true를 리턴
            }
        }
        return false; // 아니면, false를 리턴
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇 개?");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int r = (int)(Math.random()*100+1);
            if (exists(arr, i, r)) { // arr 배열, i까지, 난수 r
                i--; // 중복이 된다면, 난수를 1을 빼고
                continue; // 다시 난수 발생
            }
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