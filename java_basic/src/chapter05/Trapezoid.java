package chapter05;

import java.util.Scanner;

public class Trapezoid {
    int up;
    int down;
    int height;
    public double getArea() { // 메소드를 public 으로 지정한다.
        return (up + down) * height * 0.5;
    }

    public static void main(String[] args) {
        Trapezoid tra = new Trapezoid(); // 클래스 이름의 객체 생성 후
        Scanner scanner = new Scanner(System.in); // 스캐너로 값을 입력 받는다.
        System.out.print(">>");

        tra.up = scanner.nextInt();
        tra.down = scanner.nextInt();
        tra.height = scanner.nextInt();

        System.out.println("사다리꼴의 면적은 "+tra.getArea()); // 메소드를 이용해서, 값 출력
        scanner.close();
    }
}