package chapter06;

public class StringEx {
    public static void main(String[] args) {
        String a = new String(" C#");
        String b = new String(",C++ ");
        System.out.println(a+"의 길이는 "+a.length()); // 문자열의 길이(문자개수)
        System.out.println(a.contains("#")); // "#" 포함 여부

        a = a.concat(b); // 문자열연결
        System.out.println(a);

        a = a.trim(); // 문자열 앞 뒤 공백제거
        System.out.println(a);

        a = a.replace("C#", "Java"); // 문자열 대치
        System.out.println(a);

        String s[] = a.split(","); // 문자열 분리
        for (int i=0; i<s.length; i++) // s[0] = "Java", s[1] = "C++"
            System.out.println("분리된 문자열 " + i + ": " + s[i]);

        a = a.substring(5); // index 5부터 끝까지 서브 스트링 리턴 a="C++"
        System.out.println(a);

        char c = a.charAt(2); // 인덱스 2의 문자 리턴 '+'
        System.out.println(c);
    }
}
