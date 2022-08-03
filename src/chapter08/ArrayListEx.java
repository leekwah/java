package chapter08;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요>>");
            String str = scanner.next();
            array.add(str);
        }

        for (int i = 0; i < array.size(); i++) {
            String name = array.get(i);
            System.out.print(name+" ");
        }

        System.out.println();

        int longestName = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(longestName).length() < array.get(i).length()) {
                longestName = i;
            }
        }
        System.out.println("\n가장 긴 이름은 : "+array.get(longestName));
        scanner.close();
    }
}