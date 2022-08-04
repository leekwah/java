package Test;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = { "가위", "바위", "보" };
        int i;

            System.out.println("가위바위보 게임을 시작합니다.");
        while (true) {
            int n = (int)(Math.random()*3);
            System.out.print("가위 바위 보 >> ");
            String s = scanner.next();

            if (s.equals("그만")) {
                break;
            }

            for (i = 0; i < str.length; i++) {
                if (s.equals(str[i])) {
                    break;
                }
            }

            if (i == n) {
                System.out.println("사용자 = "+str[i]+", 컴퓨터 = "+str[n]+", 비겼습니다.");
            } else if (i == 0 && n == 2 || i == 1 && n == 0 || i == 2 && n == 1) {
                System.out.println("사용자 = "+str[i]+", 컴퓨터 = "+str[n]+", 이겼습니다.");
            } else {
                System.out.println("사용자 = "+str[i]+", 컴퓨터 = "+str[n]+", 졌습니다.");
            }

        }
        System.out.println("게임을 종료합니다.");
    }
}
