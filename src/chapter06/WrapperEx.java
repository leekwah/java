package chapter06;

public class WrapperEx {
    public static void main(String[] args) {
        char c1 = '4', c2 = 'F';

        if (Character.isDigit(c1)) {
            System.out.println(c1+"는 숫자이다.");
        } else {
            System.out.println(c1+"는 숫자가 아니다.");
        }

        if (Character.isAlphabetic(c1)) {
            System.out.println(c1+"는 영문자이다.");
        } else {
            System.out.println(c1+"는 영문자가 아니다.");
        }

        if (Character.isDigit(c2)) {
            System.out.println(c2+"는 숫자이다.");
        } else {
            System.out.println(c2+"는 숫자가 아니다.");
        }

        if (Character.isAlphabetic(c2)) {
            System.out.println(c2+"는 영문자이다.");
        } else {
            System.out.println(c2+"는 영문자가 아니다.");
        }

        System.out.println(Integer.parseInt("-123")); // "-123"을 10진수로 변환
        System.out.println(Integer.toHexString(28)); // 1c 출력 (28을 16진수문자열로 변환)
        System.out.println(Integer.toBinaryString(28)); // 11100 출력 (정수 28을 2진수 문자열로 변환)

        Double d = Double.valueOf(3.14);
        System.out.println(d.toString()); // 3.14 출력
        System.out.println(d); // 자동 언박싱에 의해서 3.14 출력
        System.out.println(Double.parseDouble("3.14")); // 문자열 3.14를 parseDouble로 출력

        boolean b = (4 > 3); // true
        System.out.println(Boolean.toString(b)); // true 출력
        System.out.println(Boolean.parseBoolean("false")); // 문자열 false를 parseBoolean으로 출력
    }
}
