package chapter05;

public class ArrayParameterEx {
    // String[] 배열을 전달받아 출력하는 printStringArray() 메소드와
    // 배열 속의 "be" 문자열을 "eat"으로 대치하는 replaceBe() 메소드를 작성하라.
    static void replaceBe(String a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("be")) {
                a[i]="eat";
            }
        }
    }
    static void printStringArray(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str[] = {"to"," ", "be"," ", "or", " ", "not", " ", "to"," ",  "be"};
        printStringArray(str);
        replaceBe(str);
        printStringArray(str);

    }
}

