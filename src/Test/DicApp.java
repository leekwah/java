package Test;

import java.util.Scanner;

class Dictionary {
    private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" }; // 한글단어 배열 생성
    private static String[] eng = { "love", "baby", "money", "future", "hope" }; // 영어단어 배열 생성

    public static String korToEng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) {
                return eng[i];
            }
        }
        return null; // 못 찾을 시에는 null return
    }
}

public class DicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true) {
            System.out.println("한글단어?");
            String kor = scanner.next();

            if (kor.equals("그만")) { // "그만"을 입력했을 경우에는 break문으로 탈출
                break;
            }

            String eng = Dictionary.korToEng(kor);
            if (eng == null) {
                System.out.println(kor+"은 사전에 없습니다.");
            } else {
                System.out.println(kor+"은/는 "+eng+"입니다.");
            }
        }
        scanner.close();
    }
}
