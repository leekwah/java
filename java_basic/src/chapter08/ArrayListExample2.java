package chapter08;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("oracle");
        array.add("ms-sql");
        array.add("MySQL");
        array.add("oracle"); // 데이터 중복 상관 없음

        for (int i = 0; i < array.size(); i++) {
            String str = array.get(i);
            System.out.println(i + " : " + str);
        }

    }
}
